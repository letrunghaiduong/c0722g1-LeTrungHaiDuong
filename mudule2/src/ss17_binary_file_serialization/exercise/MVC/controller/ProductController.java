package ss17_binary_file_serialization.exercise.MVC.controller;

import ss17_binary_file_serialization.exercise.MVC.service.IProductService;
import ss17_binary_file_serialization.exercise.MVC.service.impl.ProductService;

import java.io.IOException;
import java.util.Scanner;

public class ProductController {
    public static IProductService iProductService = new ProductService();
    public static Scanner scanner =new Scanner(System.in);

    public static void menu() throws IOException, ClassNotFoundException {
        while (true){
            System.out.println("----------- QUẢN SẢN PHẨM -----------");
            System.out.println("Chọn chức năng theo số (để tiếp tục): ");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Hiển thị sản phẩm");
            System.out.println("3. Tìm kiếm sản phẩm");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    iProductService.addProduct();
                    break;
                case 2:
                    iProductService.displayProduct();
                    break;
                case 3:
                    iProductService.seachProduct();
                    break;
            }
        }
    }

}
