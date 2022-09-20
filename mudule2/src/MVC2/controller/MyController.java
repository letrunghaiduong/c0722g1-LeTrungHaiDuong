package MVC2.controller;

import MVC2.service.ICarService;
import MVC2.service.IMotorcycleService;
import MVC2.service.ITruckService;
import MVC2.service.impl.CarService;
import MVC2.service.impl.MotorcycleService;
import MVC2.service.impl.TruckService;

import java.util.Scanner;

public class MyController {

    private ICarService iCarService = new CarService();
    private ITruckService iTruckService = new TruckService();
    private IMotorcycleService iMotorcycleService = new MotorcycleService();
    private static Scanner scanner = new Scanner(System.in);

    public void menu(){
        while (true){
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG");
            System.out.println("Chọn chức năng theo số: ");
            System.out.println("1. Thêm mới phương tiện.");
            System.out.println("2. Hiện thị phương tiện.");
            System.out.println("3. Xóa phương tiện. ");
            System.out.println("4. Tìm kiếm theo biển kiểm soát");
            System.out.println("5. Thoát.");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Chọn chức năng theo số: ");
                    System.out.println("1. Thêm mới xe ôtô.");
                    System.out.println("2. Thêm mới xe tải.");
                    System.out.println("3. Thêm mới xe máy.");
                    System.out.println("4. Thoát. ");
                    int choice1 = Integer.parseInt(scanner.nextLine());
                    switch (choice1){
                        case 1:
                            iCarService.addCar();
                            break;
                        case 2:
                            iTruckService.addTruck();
                            break;
                        case 3:
                            iMotorcycleService.addMoto();
                            break;
                        default:
                            return;
                    }
                    break;
                case 2:
                    System.out.println("Chọn chức năng theo số: ");
                    System.out.println("1. Hiện thị xe ôtô.");
                    System.out.println("2. Hiện thị xe tải.");
                    System.out.println("3. Hiện thị xe máy.");
                    System.out.println("4. Thoát. ");
                    int choice2 = Integer.parseInt(scanner.nextLine());
                    switch (choice2){
                        case 1:
                            iCarService.carList();
                            break;
                        case 2:
                            iTruckService.truckList();
                            break;
                        case 3:
                            iMotorcycleService.motoList();
                            break;
                        default:
                            return;
                    }
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("Nhập biển số xe cần tìm: ");
                    String licensePlate = scanner.nextLine();
                    iCarService.searchCar(licensePlate);
                    iTruckService.searchTruck(licensePlate);
                    iMotorcycleService.searchMoto(licensePlate);
                    break;
                case 5:
                    return;
            }
        }
    }
}
