package MVC.controller;

import MVC.service.IStudentService;
import MVC.service.impl.StudentService;

import java.util.Scanner;

public class StudentController {
    private static IStudentService iStudentService = new StudentService();
    private static Scanner scanner = new Scanner(System.in);
    public static void menuStudent(){
        while (true){
            System.out.println("-----------CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN -----------");
            System.out.println("Chọn chức năng theo số (để tiếp tục): ");
            System.out.println("1. Thêm mới học sinh");
            System.out.println("2. Xóa học sinh");
            System.out.println("3. Xem danh sách học sinh");
            System.out.println("4. Thoát");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iStudentService.addStudent();
                    break;
                case 2:
                    iStudentService.removeStudent();
                    break;
                case 3:
                    iStudentService.studentsList();
                    break;
                case 4:
                    return;
            }
        }
    }
}
