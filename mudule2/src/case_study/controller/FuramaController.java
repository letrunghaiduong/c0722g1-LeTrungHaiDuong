package case_study.controller;

import case_study.service.IBookingService;
import case_study.service.ICustomerService;
import case_study.service.IEmployeeService;
import case_study.service.IFacilityService;
import case_study.service.impl.BookingService;
import case_study.service.impl.CustomerService;
import case_study.service.impl.EmployeeService;
import case_study.service.impl.FacilityService;
import case_study.ultil.WrongInPutException;

import java.io.IOException;
import java.util.Scanner;

public class FuramaController {
    private static IFacilityService iFacilityService = new FacilityService();
    private static IEmployeeService iEmployeeService = new EmployeeService();
    private static ICustomerService iCustomerService = new CustomerService();
    private static IBookingService iBookingService = new BookingService();
    private static Scanner scanner = new Scanner(System.in);
    public static void displayMainMenu() throws IOException, WrongInPutException {
    boolean exit = false;
    boolean exit1 = false;
        while (true){
            exit = false;
            System.out.println("---------------Quản lý khu nghỉ dưỡng Furama --------------");
            System.out.println("Chọn chức năng theo số (để tiếp tục): ");
            System.out.println("1. Quản lý nhân viên");
            System.out.println("2. Quản lý khách hàng");
            System.out.println("3. Quản lý Cơ sở");
            System.out.println("4. Quản lý đặt chỗ");
            System.out.println("5. Quản lý Khuyến mãi");
            System.out.println("6. Thoát");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    while (true){
                        System.out.println("Chọn chức năng theo số (để tiếp tục): ");
                        System.out.println("1. Hiển thị danh sách nhân viên");
                        System.out.println("2. Thêm mới nhân viên");
                        System.out.println("3. Chỉnh sửa nhân viên");
                        System.out.println("4. Quay lại menu chính");
                        int choose1 = Integer.parseInt(scanner.nextLine());
                        switch (choose1){
                            case 1:
                                iEmployeeService.displayEmployee();
                                break;
                            case 2:
                                iEmployeeService.addEmployee();
                                break;
                            case 3:
                                iEmployeeService.editEmployee();
                                break;
                            case 4:
                                exit = true;
                                break ;
                        }
                        if (exit){
                            break;
                        }
                    }
                    break;
                case 2:
                    while (true){
                        System.out.println("Chọn chức năng theo số (để tiếp tục): ");
                        System.out.println("1. Hiển thị danh sách khách hàng");
                        System.out.println("2. Thêm khách hàng mới");
                        System.out.println("3. Chỉnh sửa khách hàng");
                        System.out.println("4. Quay lại menu chính");
                        int choose2 = Integer.parseInt(scanner.nextLine());
                        switch (choose2){
                            case 1:
                                iCustomerService.displayCustomer();
                                break;
                            case 2:
                                iCustomerService.addCustomer();
                                break;
                            case 3:
                                iCustomerService.editCustomer();
                                break;
                            case 4:
                                exit = true;
                                break;
                        }
                        if (exit){
                            break;
                        }
                    }
                    break;

                case 3:
                    while (true){
                        System.out.println("Chọn chức năng theo số (để tiếp tục): ");
                        System.out.println("1. Hiển thị danh sách cơ sở");
                        System.out.println("2. Thêm cơ sở mới");
                        System.out.println("3. Hiển thị danh sách cơ sở bảo trì");
                        System.out.println("4. Quay lại menu chính");
                        int choose3 = Integer.parseInt(scanner.nextLine());
                        switch (choose3){
                            case 1:
                                iFacilityService.displayFacility();
                                break;
                            case 2:
                                while (true){
                                    System.out.println("Chọn chức năng theo số (để tiếp tục): ");
                                    System.out.println("1. Thêm mới biệt thự");
                                    System.out.println("2. Thêm mới nhà");
                                    System.out.println("3. Thêm mới phòng");
                                    System.out.println("4. Quay lại menu");
                                    int chose = Integer.parseInt(scanner.nextLine());
                                    switch (chose){
                                        case 1:
                                            iFacilityService.addNewVilla();
                                        break;
                                        case 2:
                                            iFacilityService.addNewHouse();
                                            break;
                                        case 3:
                                            iFacilityService.addNewRoom();
                                            break;
                                        case 4:
                                            exit1 = true;
                                            break;
                                    }
                                    if (exit1){
                                        break;
                                    }
                                }
                                break;
                            case 3:
                            case 4:
                                exit = true;
                                break;
                        }
                        if (exit){
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("Chọn chức năng theo số (để tiếp tục): ");
                    System.out.println("1. Thêm đặt chỗ mới");
                    System.out.println("2. Hiển thị danh sách đặt chỗ");
                    System.out.println("3. Tạo hợp đồng mới");
                    System.out.println("4. Hiển thị danh sách hợp đồng");
                    System.out.println("5. Chỉnh sửa hợp đồng");
                    System.out.println("6. Quay lại menu chính");
                    int choose4 = Integer.parseInt(scanner.nextLine());
                    switch (choose4){
                        case 1:
                            iBookingService.addNewBooking();
                            break;
                        case 2:
                            iBookingService.displayBooking();
                            break;
                    }
                    break;
                case 5:
                    System.out.println("Chọn chức năng theo số (để tiếp tục): ");
                    System.out.println("1. Hiển thị danh sách khách hàng sử dụng dịch vụ");
                    System.out.println("2. Hiển thị danh sách khách hàng nhận được voucher");
                    System.out.println("3. Quay lại menu chính");
                case 6:
                    return;
            }
        }
    }
}
