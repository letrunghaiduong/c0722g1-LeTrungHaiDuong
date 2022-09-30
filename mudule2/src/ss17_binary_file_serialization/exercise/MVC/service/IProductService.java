package ss17_binary_file_serialization.exercise.MVC.service;

import java.io.IOException;

public interface IProductService {
    void addProduct() throws IOException, ClassNotFoundException;

    void displayProduct() throws IOException, ClassNotFoundException;

    void seachProduct() throws IOException, ClassNotFoundException;
}
