package case_study.service.impl;

import case_study.model.Employee;
import case_study.service.IEmployeeService;
import case_study.service.ultil.Check;
import case_study.service.ultil.WrongInPutException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    List<Employee> employeeList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void displayEmployee() throws IOException {
        employeeList = readEmployeeFile();
        for (Employee employee : employeeList) {
            System.out.println(employee.toString());
        }
    }

    @Override
    public void addEmployee() throws IOException, WrongInPutException {
        employeeList = readEmployeeFile();
        Employee employee = this.infoEmployee();
        employeeList.add(employee);
        System.out.println("Thêm mới thành công");
        writeEmployeeFile(employeeList);
    }

    @Override
    public void editEmployee() throws IOException, WrongInPutException {
        employeeList = readEmployeeFile();
        int code;
        while (true){
            try {
                System.out.println("Nhập mã nhân viên muốn edit: ");
                code =Integer.parseInt(scanner.nextLine());
                break;
            }catch (NumberFormatException e){
                System.out.println("Mã không hợp lệ, nhập lại: ");
            }
        }
        boolean check =false;
        for (int i = 0; i < employeeList.size(); i++){
            if (employeeList.get(i).getCode()==code){
                check =true;
                System.out.println("Nhân viên muốn edit là: ");
                System.out.println(employeeList.get(i));
                employeeList.remove(i);
                Employee employee = this.infoEmployee();
                employeeList.add(i, employee);
                System.out.println("Edit thành công");
                writeEmployeeFile(employeeList);
                break;
            }
        }
        if (!check){
            System.out.println("Không tìm thấy nhân viên");
        }
    }

    private List<Employee> readEmployeeFile() throws IOException {
        File file = new File("src\\case_study\\data\\employee.csv");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        List<Employee> employeeList = new ArrayList<>();
        Employee employee;
        String line;
        String[] info;
        while ((line = reader.readLine()) != null) {
            info = line.split(",");
            employee = new Employee(Integer.parseInt(info[0]), info[1], info[2], info[3], info[4], info[5], info[6], info[7], info[8], Double.parseDouble(info[9]));
            employeeList.add(employee);
        }
        reader.close();
        return employeeList;
    }

    private void writeEmployeeFile(List<Employee> employeeList) throws IOException {
        File file = new File("src\\case_study\\data\\employee.csv");
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        for (Employee employee : employeeList) {
            writer.write(employee.getInfo());
            writer.newLine();
        }
        writer.close();
    }

    private Employee infoEmployee() throws WrongInPutException {
        int code;
        String name;
        String dateOfBirth;
        String gender;
        String identityCard;
        String phoneNumber;
        String email;
        String level;
        String position;
        double wage;
        while (true) {
            try {
                System.out.print("Mời bạn nhập mã nhân viên: ");
                code = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Mã không hợp lệ, nhập lại: ");
            }
        }
        while (true) {
            try {
                System.out.println("Mời bạn nhập tên nhân viên: ");
                name = scanner.nextLine();
                Check.checkName(name);
                break;
            } catch (WrongInPutException e) {
                System.out.println(e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.println("Mời bạn nhập ngày sinh nhân viên: ");
                dateOfBirth = scanner.nextLine();
                Check.checkDateOfBirth(dateOfBirth);
                break;
            } catch (WrongInPutException e) {
                System.out.println(e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.println("Mời bạn nhập giới tính nhân viên: ");
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
        while (true) {
            try {
                System.out.println("Mời bạn nhập trình độ nhân viên: ");
                level = scanner.nextLine();
                Check.checkLevel(level);
                break;
            } catch (WrongInPutException e) {
                System.out.println(e.getMessage());
            }
        }
        while (true){
            try {
                System.out.println("Mời bạn nhập chức vụ: ");
                position = scanner.nextLine();
                Check.checkPosition(position);
                break;
            }catch (WrongInPutException e){
                System.out.println(e.getMessage());
            }
        }
        while (true){
            try {
                System.out.println("Mời bạn nhập mức lương: ");
                wage = Double.parseDouble(scanner.nextLine());
                break;
            }catch (NumberFormatException e){
                System.out.println("Mức lương không hợp lệ, nhập lại");
            }
        }

        Employee employee = new Employee(code,name,dateOfBirth,gender,identityCard,phoneNumber,email,level,position,wage);
        return employee;
    }
}