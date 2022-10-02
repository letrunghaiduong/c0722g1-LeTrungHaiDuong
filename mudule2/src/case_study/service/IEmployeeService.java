package case_study.service;

import case_study.service.ultil.WrongInPutException;

import java.io.IOException;

public interface IEmployeeService {
    void displayEmployee() throws IOException;

    void addEmployee() throws IOException, WrongInPutException;

    void editEmployee() throws IOException, WrongInPutException;
}
