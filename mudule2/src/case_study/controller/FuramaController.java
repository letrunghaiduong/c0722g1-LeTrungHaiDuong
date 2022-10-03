package case_study.controller;

import case_study.service.ICustomerService;
import case_study.service.IEmployeeService;
import case_study.service.IFacilityService;
import case_study.service.impl.CustomerService;
import case_study.service.impl.EmployeeService;
import case_study.service.impl.FacilityService;
import case_study.service.ultil.WrongInPutException;

import java.io.IOException;
import java.util.Scanner;

public class FuramaController {
    private static IFacilityService iFacilityService = new FacilityService();
    private static IEmployeeService iEmployeeService = new EmployeeService();
    private static ICustomerService iCustomerService = new CustomerService();
    private static Scanner scanner = new Scanner(System.in);
    public static void displayMainMenu() throws IOException, WrongInPutException {
    boolean exit = false;
        while (true){
            exit = false;
            System.out.println("---------------Furama resort manager --------------");
            System.out.println("Select function by number (to continue): ");
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    while (true){
                        System.out.println("Select function by number (to continue): ");
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
                        System.out.println("Select function by number (to continue): ");
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
                        System.out.println("Select function by number (to continue): ");
                        System.out.println("1. Display list facility");
                        System.out.println("2. Add new facility");
                        System.out.println("3. Display list facility maintenance");
                        System.out.println("4. Return main menu");
                        int choose3 = Integer.parseInt(scanner.nextLine());
                        switch (choose3){
                            case 1:
                                iFacilityService.displayFacility();
                                break;
                            case 2:
                                while (true){
                                    System.out.println("Select function by number (to continue): ");
                                    System.out.println("1. Add New Villa");
                                    System.out.println("2. Add New House");
                                    System.out.println("3. Add New Room");
                                    System.out.println("4. Back to menu");
                                    int chose = Integer.parseInt(scanner.nextLine());
                                    switch (chose){
                                        case 1:

                                    }
                                }
                        }
                    }
                case 4:
                    System.out.println("Select function by number (to continue): ");
                    System.out.println("1. Add new booking");
                    System.out.println("2. Display list booking");
                    System.out.println("3. Create new constracts");
                    System.out.println("4. Display list contracts");
                    System.out.println("5. Edit contracts");
                    System.out.println("6. Return main menu");
                case 5:
                    System.out.println("Select function by number (to continue): ");
                    System.out.println("1. Display list customers use service");
                    System.out.println("2. Display list customers get voucher");
                    System.out.println("3. Return main menu");
            }
        }
    }
}
