package service.impl;

import model.customer.CustomerType;
import repostory.ICustomerRepostory;
import repostory.ICustomerTypeRepostory;
import repostory.impl.CustomerRepostory;
import repostory.impl.CustomerTypeRepostory;
import service.ICustomerService;
import service.ICustomerTypeService;

import java.util.List;

public class CustomerTypeService implements ICustomerTypeService {
    ICustomerTypeRepostory customerTypeRepostory = new CustomerTypeRepostory();
    @Override
    public List<CustomerType> findAll() {
        return customerTypeRepostory.findAll();
    }
}
