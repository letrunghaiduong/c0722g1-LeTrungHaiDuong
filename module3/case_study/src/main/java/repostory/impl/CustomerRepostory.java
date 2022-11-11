package repostory.impl;

import model.Customer;
import model.Employee;
import repostory.BaseRepostory;
import repostory.ICustomerRepostory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepostory implements ICustomerRepostory {
    private static final String SELECT_ALL = "select * from customer;";
    private final String INSERT_CUSTOMER = "insert into customer(customer_type_id,name,date_of_birth,gender,id_card,phone_number,email,address) \n" + " values (?,?,?,?,?,?,?,?);";
    private static final String UPDATE_CUSTOMER_SQL = "UPDATE CUSTOMER SET name = ? ,day_of_birth = ?, gender = ?, id_card = ?, phone_number = ?, email = ?, address = ?, customer_type_id = ? WHERE id = ?;";
    private static final String DELETE_CUSTOMER_SQL = "DELETE FROM customer WHERE id = ?;";
    @Override
    public List<Customer> findAll() {
        List<Customer> customerList = new ArrayList<>();
        Connection connection = BaseRepostory.getConnectDB();
        try {
            PreparedStatement ps = connection.prepareStatement(SELECT_ALL);
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
                Customer customer = new Customer(id,customerTypeId,name,dateOfBirth,gender,idCard,phoneNumber,email,address);
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
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_CUSTOMER_SQL);
            preparedStatement.setInt(1, customer.getId());
            preparedStatement.setInt(2, customer.getCustomerTypeId());
            preparedStatement.setString(3, customer.getName());
            preparedStatement.setDate(4, Date.valueOf(customer.getDateOfBirth()));
            preparedStatement.setString(5, customer.getGender());
            preparedStatement.setString(6, customer.getIdCard());
            preparedStatement.setString(7, customer.getPhoneNumber());
            preparedStatement.setString(8, customer.getEmail());
            preparedStatement.setString(9, customer.getAddress());
            return preparedStatement.executeUpdate() > 0;
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
}
