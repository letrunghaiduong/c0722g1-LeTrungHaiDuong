package MVC2.service.impl;


import MVC2.controller.MyController;
import MVC2.service.ICarService;
import MVC2.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarService implements ICarService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Car> carList = new ArrayList<>();

    @Override
    public void addCar() {
        Car car = this.infoCar();
        carList.add(car);
        System.out.println("Thêm mới thành công");
    }

    @Override
    public void carList() {
        System.out.println("Danh sách xe ô tô: ");
        for (Car car : carList) {
            System.out.println(car);
        }
    }

    @Override
    public void searchCar(String licensePlate) {
        boolean check = false;
        for (int i = 0; i < carList.size(); i++) {
            if (carList.get(i).getLicensePlate().contains(licensePlate)) {
                System.out.println(carList.get(i));
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Không tìm thấy phương tiện! ");
        }
    }

    public Car infoCar() {
        System.out.println("Mời bạn nhập biển số : ");
        String licensePlate = scanner.nextLine();
        System.out.println("Mời bạn nhập tên hãng : ");
        String manufacturer = scanner.nextLine();
        System.out.println("Mời bạn nhập năm sản xuất : ");
        int yearOfManufacture = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời bạn nhập tên chủ sỡ hữu : ");
        String owner = scanner.nextLine();
        System.out.println("Mời bạn nhập số chỗ ngồi : ");
        int numberOfSeats = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời bạn nhập kiểu xe : ");
        String carType = scanner.nextLine();
        Car car = new Car(licensePlate, manufacturer, yearOfManufacture, owner, numberOfSeats, carType);
        return car;
    }
}
