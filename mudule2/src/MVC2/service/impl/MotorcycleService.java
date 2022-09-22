package MVC2.service.impl;

import MVC2.model.Motorcycle;
import MVC2.service.IMotorcycleService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MotorcycleService implements IMotorcycleService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Motorcycle> motorcycleList = new ArrayList<>();

    @Override
    public void addMoto() {
        Motorcycle motorcycle = this.infoMoto();
        motorcycleList.add(motorcycle);
        System.out.println("Thêm mới thành công");
    }

    @Override
    public void motoList() {
        System.out.println("Danh sách xe máy: ");
        for (Motorcycle motorcycle : motorcycleList) {
            System.out.println(motorcycle);
        }
    }

    @Override
    public void searchMoto(String licensePlate) {
        boolean check = false;
        for (int i = 0; i < motorcycleList.size(); i++) {
            if (motorcycleList.get(i).getLicensePlate().contains(licensePlate)) {
                System.out.println(motorcycleList.get(i));
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Không tìm thấy phương tiện! ");
        }
    }

    @Override
    public void removeMoto(String licensePlateRemove) {
        boolean check = false;
        for (int i = 0; i < motorcycleList.size(); i++) {
            if (motorcycleList.get(i).getLicensePlate().contains(licensePlateRemove)) {
                System.out.println("Bạn có chắc muốn xóa học sinh này không? Nhập Y: yes, N: no");
                String choice = scanner.nextLine();
                if (choice.equals("Y")) {
                    motorcycleList.remove(i);
                    System.out.println("Xóa thành công");
                }

                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Không tìm thấy phương tiện! ");
        }
    }

    public Motorcycle infoMoto() {
        System.out.println("Mời bạn nhập biển số : ");
        String licensePlate = scanner.nextLine();
        System.out.println("Mời bạn nhập tên hãng : ");
        String manufacturer = scanner.nextLine();
        System.out.println("Mời bạn nhập năm sản xuất : ");
        int yearOfManufacture = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời bạn nhập tên chủ sỡ hữu : ");
        String owner = scanner.nextLine();
        System.out.println("Mời bạn nhập công suất : ");
        String wattage = scanner.nextLine();
        Motorcycle motorcycle = new Motorcycle(licensePlate, manufacturer, yearOfManufacture, owner, wattage);
        return motorcycle;
    }
}
