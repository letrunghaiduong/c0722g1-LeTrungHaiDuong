package repostory;

import model.Customer;


import java.util.List;

public interface ICustomerRepostory {
    List<Customer> findAll();
    boolean add(Customer customer);
    boolean update(Customer customer);
    boolean delete(int id);
}
