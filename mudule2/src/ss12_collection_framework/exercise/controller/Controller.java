package ss12_collection_framework.exercise.controller;

import ss12_collection_framework.exercise.service.IProductManagerService;
import ss12_collection_framework.exercise.service.impl.ProductManaferService;

import java.util.Scanner;

public class Controller {
    Scanner scanner = new Scanner(System.in);
    IProductManagerService iProductManagerService = new ProductManaferService();
    public void menu(){
        while (true){
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ SẢN PHẨM");
            System.out.println("Chọn chức năng theo số: ");
            System.out.println("1. Thêm mới sản phẩm.");
            System.out.println("2. Sửa thông tin sản phẩm theo id.");
            System.out.println("3. Xoá sản phẩm theo id. ");
            System.out.println("4. Hiển thị danh sách sản phẩm");
            System.out.println("5. Tìm kiếm sản phẩm theo tên.");
            System.out.println("6. Sắp xếp sản phẩm tăng dần, giảm dần theo giá.");
            System.out.println("7. Thoát.");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    iProductManagerService.addProduct();
                    break;
                case 2:
                    System.out.println("Nhập id sản phầm cần sửa: ");
                    int idEdit = Integer.parseInt(scanner.nextLine());
                    iProductManagerService.editProduct(idEdit);
                    break;
                case 3:
                    System.out.println("Nhập id sản phẩm cần xóa: ");
                    int idRemove = Integer.parseInt(scanner.nextLine());
                    iProductManagerService.removeProduct(idRemove);
                    break;
                case 4:
                    iProductManagerService.productList();
                    break;
                case 5:
                    System.out.println("Nhập tên sản phẩm cần tìm: ");
                    String nameToSearch = scanner.nextLine();
                    iProductManagerService.seachByName(nameToSearch);
                    break;
                case 6:
                    System.out.println("Chọn chức năng theo số: ");
                    System.out.println("1. Sắp xếp tăng dần theo giá ");
                    System.out.println("2. Sắp xếp giảm dần theo giá ");
                    int choose = Integer.parseInt(scanner.nextLine());
                    switch (choose){
                        case 1:
                            iProductManagerService.ascending();
                            break;
                        case 2:
                            iProductManagerService.decrease();
                            break;
                    }
                    break;
                case 7:
                    return;
            }
        }
    }
}
