package case_study.controller;

import case_study.service.ICustomerService;
import case_study.service.IEmployeeService;
import case_study.service.impl.CustomerService;
import case_study.service.impl.EmployeeService;
import case_study.service.ultil.WrongInPutException;

import java.io.IOException;
import java.util.Scanner;

public class FuramaController {
    private static IEmployeeService iEmployeeService = new EmployeeService();
    private static ICustomerService iCustomerService = new CustomerService();
    private static Scanner scanner = new Scanner(System.in);
    public static void displayMainMenu() throws IOException, WrongInPutException {
        while (true){
            System.out.println("-----------Ứng dụng quản lý khu nghỉ dưỡng Furama -----------");
            System.out.println("Chọn chức năng theo số (để tiếp tục): ");
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Chọn chức năng theo số (để tiếp tục): ");
                    System.out.println("1. Display list employees");
                    System.out.println("2. Add new employee");
                    System.out.println("3. Edit employee");
                    System.out.println("4. Return main menu");
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
                        default:
                            break;
                    }
                case 2:
                    System.out.println("Chọn chức năng theo số (để tiếp tục): ");
                    System.out.println("1. Display list customers");
                    System.out.println("2. Add new customer");
                    System.out.println("3. Edit customer");
                    System.out.println("4. Return main menu");
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
                    }
                case 3:
                    System.out.println("Chọn chức năng theo số (để tiếp tục): ");
                    System.out.println("1. Display list facility");
                    System.out.println("2. Add new facility");
                    System.out.println("3. Display list facility maintenance");
                    System.out.println("4. Return main menu");
                    int choose3 = Integer.parseInt(scanner.nextLine());
                    switch (choose3){
                        case 1:
                            
                    }
            }
        }
    }
}
