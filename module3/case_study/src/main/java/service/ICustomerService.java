package service;

import model.customer.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();
    boolean add(Customer customer);
    boolean update(Customer customer);
    boolean delete(int id);
    Customer findById(int id);
    List<Customer> search(String name);
}
