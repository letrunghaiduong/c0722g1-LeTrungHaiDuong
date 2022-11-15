package repostory;

import model.customer.CustomerType;

import java.util.List;

public interface ICustomerTypeRepostory {
    List<CustomerType> findAll();
}
