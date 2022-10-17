package case_study.service.impl;

import case_study.model.Customer;
import case_study.service.ICustomerService;
import case_study.ultil.Check;
import case_study.ultil.WrongInPutException;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    List<Customer> customerList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");


    @Override
    public void displayCustomer() throws IOException {
        customerList = readCustomerFile();
        for (Customer customer: customerList){
        System.out.println(customer.toString());
        }
    }

    @Override
    public void addCustomer() throws IOException, WrongInPutException {
        customerList = readCustomerFile();
        Customer customer = this.infoCustomer();
        customerList.add(customer);
        System.out.println("Thêm mới thành công");
        writeCustomerFile(customerList);
    }

    @Override
    public void editCustomer() throws IOException, WrongInPutException {
        customerList = readCustomerFile();
        int code;
        while (true){
            try {
                System.out.println("Nhập mã khách hàng muốn edit: ");
                code =Integer.parseInt(scanner.nextLine());
                break;
            }catch (NumberFormatException e){
                System.out.println("Mã không hợp lệ, nhập lại: ");
            }
        }
        boolean check =false;
        for (int i = 0; i < customerList.size(); i++){
            if (customerList.get(i).getCode()==code){
                check =true;
                System.out.println("Khách hàng muốn edit là: ");
                System.out.println(customerList.get(i));
                customerList.remove(i);
                Customer customer = this.infoCustomer();
                customerList.add(i, customer);
                System.out.println("Edit thành công");
                writeCustomerFile(customerList);
                break;
            }
        }
        if (!check){
            System.out.println("Không tìm thấy khách hàng");
        }
    }

    public static List<Customer> readCustomerFile() throws IOException {
        File file = new File("src\\case_study\\data\\customer.csv");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        List<Customer> customerList = new ArrayList<>();
        Customer customer;
        String line;
        String[] info;
        while ((line = reader.readLine()) != null) {
            info = line.split(",");
            customer = new Customer(Integer.parseInt(info[0]), info[1], LocalDate.parse(info[2]), info[3], info[4], info[5], info[6], info[7], info[8]);
            customerList.add(customer);
        }
        reader.close();
        return customerList;
    }

    public static void writeCustomerFile(List<Customer> customerList) throws IOException {
        File file = new File("src\\case_study\\data\\customer.csv");
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        for (Customer customer: customerList) {
            writer.write(customer.getInfo());
            writer.newLine();
        }
        writer.close();
    }

    private Customer infoCustomer() throws WrongInPutException{
        int code;
        String name;
        LocalDate dateOfBirth;
        String gender;
        String identityCard;
        String phoneNumber;
        String email;
        String customerType;
        String address;
        while (true){
            try {
                System.out.println("Mời bạn nhập mã khách hàng: ");
                code = Integer.parseInt(scanner.nextLine());
                Check.checkCodeCustomer(code);
                break;
            }catch (NumberFormatException | IOException e){
                System.out.println("Mã không hợp lệ, nhập lại");
            }catch (WrongInPutException e){
                System.out.println(e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.println("Mời bạn nhập tên khách hàng: ");
                name = scanner.nextLine();
                Check.checkName(name);
                break;
            } catch (WrongInPutException e) {
                System.out.println(e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.println("Mời bạn nhập ngày sinh: ");
                dateOfBirth = LocalDate.parse(scanner.nextLine(), formatter);
                Check.checkAge(dateOfBirth);
                break;
            } catch (WrongInPutException e) {
                System.out.println(e.getMessage());
            } catch (Exception e){
                System.out.println("Ngày sinh không đúng định dạng, nhập lại: ");
            }
        }
        while (true) {
            try {
                System.out.println("Mời bạn nhập giới tính khách hàng: ");
                gender = scanner.nextLine();
                Check.checkGender(gender);
                break;
            } catch (WrongInPutException e) {
                System.out.println(e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.println("Mời bạn nhập số CMND: ");
                identityCard = scanner.nextLine();
                Check.checkIdentityCard(identityCard);
                break;
            } catch (WrongInPutException e) {
                System.out.println(e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.println("Mời bạn nhập số điện thoại: ");
                phoneNumber = scanner.nextLine();
                Check.checkPhoneNumber(phoneNumber);
                break;
            } catch (WrongInPutException e) {
                System.out.println(e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.println("Mời bạn nhập Email: ");
                email = scanner.nextLine();
                Check.checkEmail(email);
                break;
            } catch (WrongInPutException e) {
                System.out.println(e.getMessage());
            }
        }
        while (true){
            try {
                System.out.println("Mời bạn nhập loại khách hàng(Diamond|Platinium|Gold|Silver|Member): ");
                customerType = scanner.nextLine();
                Check.checkCustomerType(customerType);
                break;
            }catch (WrongInPutException e){
                System.out.println(e.getMessage());
            }
        }
        while (true){
            try {
                System.out.println("Mời bạn nhập địa chỉ khách hàng: ");
                address = scanner.nextLine();
                Check.checkAddress(address);
                break;
            }catch (WrongInPutException e){
                System.out.println(e.getMessage());
            }
        }
        Customer customer = new Customer(code,name,dateOfBirth,gender,identityCard,phoneNumber,email,customerType,address);
        return customer;
    }
}
