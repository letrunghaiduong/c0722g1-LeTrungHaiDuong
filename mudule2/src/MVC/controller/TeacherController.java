package MVC.controller;

import MVC.service.IStudentService;
import MVC.service.ITeacherService;
import MVC.service.impl.StudentService;
import MVC.service.impl.TeacherService;

import java.util.Scanner;

public class TeacherController {
    private static ITeacherService iTeacherService = new TeacherService();
    private static Scanner scanner = new Scanner(System.in);

    public static void menuTeacher(){
        while (true){
            System.out.println("-----------CHƯƠNG TRÌNH QUẢN LÝ GIẢNG VIÊN -----------");
            System.out.println("Chọn chức năng theo số (để tiếp tục): ");
            System.out.println("1. Thêm mới giảng viên");
            System.out.println("2. Xóa giảng viên");
            System.out.println("3. Xem danh sách giảng viên");
            System.out.println("4. Thoát");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iTeacherService.addTeacher();
                    break;
                case 2:
                    iTeacherService.removeTeacher();
                    break;
                case 3:
                    iTeacherService.teachersList();
                    break;
                case 4:
                    return;
            }
        }
    }
}
