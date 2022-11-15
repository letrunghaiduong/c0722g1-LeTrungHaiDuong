package repostory.impl;

import model.customer.Customer;
import model.customer.CustomerType;
import repostory.BaseRepostory;
import repostory.ICustomerRepostory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepostory implements ICustomerRepostory {

    private final String INSERT_CUSTOMER = "insert into customer(customer_type_id,name,date_of_birth,gender,id_card,phone_number,email,address) \n" + " values (?,?,?,?,?,?,?,?);";
    private static final String UPDATE_CUSTOMER_SQL = "UPDATE customer SET name = ? ,date_of_birth = ?, gender = ?, id_card = ?, phone_number = ?, email = ?, address = ?, customer_type_id = ? WHERE id = ?;";
    private static final String DELETE_CUSTOMER_SQL = "DELETE FROM customer WHERE id = ?;";
    private static final String SELECT_FIND_BY_ID = "select * from customer where id = ?;";
    private static final String SEARCH_CUSTOMER_SQL = "select c.*, ct.name as type_name from customer c\n" +
            "            join customer_type ct \n" +
            "            on c.customer_type_id = ct.id\n" +
            "            where c.name like ? or  c.address like ? or c.id =?;";

    private static final String JOIN_CUSTOMER = "select c.*, ct.name as type_name from customer c\n" +
            "join customer_type ct\n" +
            "on c.customer_type_id = ct.id;";

    @Override
    public List<Customer> findAll() {
        List<Customer> customerList = new ArrayList<>();
        Connection connection = BaseRepostory.getConnectDB();
        try {
            PreparedStatement ps = connection.prepareStatement(JOIN_CUSTOMER);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                int customerTypeId = resultSet.getInt("customer_type_id");
                String name = resultSet.getString("name");
                String dateOfBirth = resultSet.getString("date_of_birth");
                String gender = resultSet.getString("gender");
                String idCard = resultSet.getString("id_card");
                String phoneNumber = resultSet.getString("phone_number");
                String email = resultSet.getString("email");
                String address = resultSet.getString("address");
                String customerTypeName = resultSet.getString("type_name");
                CustomerType customerType = new CustomerType(customerTypeId,customerTypeName);
                Customer customer = new Customer(id,customerTypeId,name,dateOfBirth,gender,idCard,phoneNumber,email,address,customerType);
                customerList.add(customer);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return customerList;
    }

    @Override
    public boolean add(Customer customer) {
        Connection connection = BaseRepostory.getConnectDB();
        try {
            PreparedStatement ps = connection.prepareStatement(INSERT_CUSTOMER);
            ps.setInt(1, customer.getCustomerTypeId());
            ps.setString(2, customer.getName());
            ps.setDate(3, Date.valueOf(customer.getDateOfBirth()));
            ps.setBoolean(4, Boolean.parseBoolean(customer.getGender()));
            ps.setString(5, customer.getIdCard());
            ps.setString(6, customer.getPhoneNumber());
            ps.setString(7, customer.getEmail());
            ps.setString(8, customer.getAddress());
            return ps.executeUpdate() > 0;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean update(Customer customer) {
        Connection connection = BaseRepostory.getConnectDB();
        try {
            PreparedStatement ps = connection.prepareStatement(UPDATE_CUSTOMER_SQL);
            ps.setString(1, customer.getName());
            ps.setDate(2, Date.valueOf(customer.getDateOfBirth()));
            ps.setBoolean(3, Boolean.parseBoolean(customer.getGender()));
            ps.setString(4, customer.getIdCard());
            ps.setString(5, customer.getPhoneNumber());
            ps.setString(6, customer.getEmail());
            ps.setString(7, customer.getAddress());
            ps.setInt(8, customer.getCustomerTypeId());
            ps.setInt(9, customer.getId());
            return ps.executeUpdate() > 0;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        Connection connection = BaseRepostory.getConnectDB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_CUSTOMER_SQL);
            preparedStatement.setInt(1, id);
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }

    @Override
    public Customer findById(int id) {
        Customer customer = null;
        Connection connection = BaseRepostory.getConnectDB();
        try {
            PreparedStatement ps = connection.prepareStatement(SELECT_FIND_BY_ID);

            ps.setInt(1, id);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                int customerTypeId = resultSet.getInt("customer_type_id");
                String name = resultSet.getString("name");
                String dateOfBirth = resultSet.getString("date_of_birth");
                String gender = resultSet.getString("gender");
                String idCard = resultSet.getString("id_card");
                String phoneNumber = resultSet.getString("phone_number");
                String email = resultSet.getString("email");
                String address = resultSet.getString("address");
//                String customerTypeName = resultSet.getString("type_name");
//                CustomerType customerType = new CustomerType(customerTypeId,customerTypeName);
                customer = new Customer(id,customerTypeId,name,dateOfBirth,gender,idCard,phoneNumber,email,address);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customer;
    }

    @Override
    public List<Customer> search(String keySearch) {
        List<Customer> customerList = new ArrayList<>();
        Connection connection = BaseRepostory.getConnectDB();
        try {
            PreparedStatement ps = connection.prepareStatement(SEARCH_CUSTOMER_SQL);
            ps.setString(1,"%"+keySearch+"%");
            ps.setString(2,"%"+keySearch+"%");
            ps.setString(3,"%"+keySearch+"%");
//            ps.setInt(3, Integer.parseInt(keySearch));
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int customerTypeId = resultSet.getInt("customer_type_id");
                String dateOfBirth = resultSet.getString("date_of_birth");
                String gender = resultSet.getString("gender");
                String idCard = resultSet.getString("id_card");
                String phoneNumber = resultSet.getString("phone_number");
                String email = resultSet.getString("email");
                String address = resultSet.getString("address");
                String customerTypeName = resultSet.getString("type_name");
                CustomerType customerType = new CustomerType(customerTypeId,customerTypeName);
                Customer customer = new Customer(id,customerTypeId,name,dateOfBirth,gender,idCard,phoneNumber,email,address,customerType);
                customerList.add(customer);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return customerList;
    }
}
