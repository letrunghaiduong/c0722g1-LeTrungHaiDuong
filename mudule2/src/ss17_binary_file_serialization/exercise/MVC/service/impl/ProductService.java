package ss17_binary_file_serialization.exercise.MVC.service.impl;

import ss17_binary_file_serialization.exercise.MVC.model.Product;
import ss17_binary_file_serialization.exercise.MVC.service.IProductService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    public static Scanner scanner = new Scanner(System.in);
    public static List<Product> productList = new ArrayList<>();

    @Override
    public void addProduct() throws IOException, ClassNotFoundException {
        productList = readFile();
        Product product = this.infoProduct();
        productList.add(product);
        System.out.println("Thêm mới thành công");
        writeFile(productList);
    }

    @Override
    public void displayProduct() throws IOException, ClassNotFoundException {
        productList = readFile();
        for (Product product: productList){
            System.out.println(product.getInfo());
        }
    }

    @Override
    public void seachProduct() throws IOException, ClassNotFoundException {
        productList = readFile();
        int code;
        while (true){
            try {
                System.out.println("Mời bạn nhập mã sản phẩm cần tìm: ");
                code = Integer.parseInt(scanner.nextLine());
                break;
            }catch (NumberFormatException e){
                System.out.println("Mã không hợp lệ, nhập lại: ");
            }
        }
        boolean check = false;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getCode() == (code)) {
                System.out.println(productList.get(i));
                check = true;
            }
        }
        if (!check) {
            System.out.println("Không tìm thấy sản phẩm ");
        }
    }

    private Product infoProduct(){
        int code;
        double price;
        while (true){
            try {
                System.out.println("Mời bạn nhập mã sản phẩm: ");
                code = Integer.parseInt(scanner.nextLine());
                break;
            }catch (NumberFormatException e){
                System.out.println("Mã không hợp lệ, nhập lại: ");
            }
        }
        System.out.println("Mời bạn nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.println("Mời bạn nhập tên hãng sản xuất: ");
        String manufacturer = scanner.nextLine();

        while (true){
            try {
                System.out.println("Mời bạn giá bán sản phẩm: ");
                price = Double.parseDouble(scanner.nextLine());
                break;
            }catch (NumberFormatException e){
                System.out.println("Giá không hợp lệ, nhập lại: ");
            }
        }
        System.out.println("Mời bạn nhập mô tả dản phẩm: ");
        String describe = scanner.nextLine();

        Product product = new Product(code,name,manufacturer,price,describe);
        return product;
    }

    private void writeFile(List<Product> productList ) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("src\\ss17_binary_file_serialization\\exercise\\MVC\\data\\ProductFile.csv");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(productList);
        objectOutputStream.close();
    }

    private List<Product> readFile() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("src\\ss17_binary_file_serialization\\exercise\\MVC\\data\\ProductFile.csv");
        List<Product> productList = null;
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            productList = (List<Product>) objectInputStream.readObject();
            objectInputStream.close();
        } catch (EOFException e) {
            System.out.println("Không có dữ liệu");

        }

        return productList;

    }

}
