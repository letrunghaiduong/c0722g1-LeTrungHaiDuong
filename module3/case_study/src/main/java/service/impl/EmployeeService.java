package service.impl;

import model.employee.Employee;
import repostory.IEmployeeRepostory;
import repostory.impl.EmployeeRepostory;
import service.IEmployeeService;

import java.util.List;

public class EmployeeService implements IEmployeeService {
    IEmployeeRepostory employeeRepostory = new EmployeeRepostory();
    @Override
    public List<Employee> findAll() {
        return employeeRepostory.findAll();
    }
}
