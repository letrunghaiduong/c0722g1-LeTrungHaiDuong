package service.impl;

import model.Customer;
import repostory.ICustomerRepostory;
import repostory.impl.CustomerRepostory;
import service.ICustomerService;

import java.util.List;

public class CustomerService implements ICustomerService {
    ICustomerRepostory customerRepostory = new CustomerRepostory();
    @Override
    public List<Customer> findAll() {
        return customerRepostory.findAll();
    }

    @Override
    public boolean add(Customer customer) {
        return customerRepostory.add(customer);
    }

    @Override
    public boolean update(Customer customer) {
        return customerRepostory.update(customer);
    }

    @Override
    public boolean delete(int id) {
        return customerRepostory.delete(id);
    }
}
