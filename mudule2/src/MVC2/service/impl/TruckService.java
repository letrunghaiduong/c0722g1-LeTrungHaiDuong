package MVC2.service.impl;

import MVC2.model.Truck;
import MVC2.service.ITruckService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TruckService implements ITruckService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Truck> truckList = new ArrayList<>();

    @Override
    public void addTruck() {
        Truck truck = this.infoTruck();
        truckList.add(truck);
        System.out.println("Thêm mới thành công");
    }

    @Override
    public void truckList() {
        System.out.println("Danh sách xe tải: ");

        for (Truck truck : truckList) {
            System.out.println(truck);
        }
    }

    @Override
    public void searchTruck(String licensePlate) {
        boolean check = false;
        for (int i = 0; i < truckList.size(); i++) {
            if (truckList.get(i).getLicensePlate().contains(licensePlate)) {
                System.out.println(truckList.get(i));
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Không tìm thấy phương tiện! ");
        }
    }

    public Truck infoTruck() {
        System.out.println("Mời bạn nhập biển số : ");
        String licensePlate = scanner.nextLine();
        System.out.println("Mời bạn nhập tên hãng : ");
        String manufacturer = scanner.nextLine();
        System.out.println("Mời bạn nhập năm sản xuất : ");
        int yearOfManufacture = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời bạn nhập tên chủ sỡ hữu : ");
        String owner = scanner.nextLine();
        System.out.println("Mời bạn nhập trọng tải: ");
        String tonnage = scanner.nextLine();
        Truck truck = new Truck(licensePlate, manufacturer, yearOfManufacture, owner, tonnage);
        return truck;
    }
}
