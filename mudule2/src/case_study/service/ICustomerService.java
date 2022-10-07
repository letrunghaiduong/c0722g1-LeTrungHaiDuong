package case_study.service;

import case_study.ultil.WrongInPutException;

import java.io.IOException;

public interface ICustomerService {
    void displayCustomer() throws IOException;

    void addCustomer() throws IOException, WrongInPutException;

    void editCustomer() throws IOException, WrongInPutException;
}
