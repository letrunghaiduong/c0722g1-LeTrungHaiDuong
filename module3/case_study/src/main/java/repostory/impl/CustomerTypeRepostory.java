package repostory.impl;

import model.customer.Customer;
import model.customer.CustomerType;
import repostory.BaseRepostory;
import repostory.ICustomerTypeRepostory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerTypeRepostory implements ICustomerTypeRepostory {
    private final String SELECT_CUSTOMER_TYPE = "select * from customer_type;";

    @Override
    public List<CustomerType> findAll() {
        List<CustomerType> customerTypeList = new ArrayList<>();
        Connection connection = BaseRepostory.getConnectDB();
        try {
            PreparedStatement ps = connection.prepareStatement(SELECT_CUSTOMER_TYPE);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                CustomerType customerType = new CustomerType(id,name);
                customerTypeList.add(customerType);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return customerTypeList;
    }
}
