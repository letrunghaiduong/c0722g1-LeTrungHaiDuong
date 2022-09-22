package MVC.controller;

import MVC.service.IStudentService;
import MVC.service.ITeacherService;
import MVC.service.impl.StudentService;
import MVC.service.impl.TeacherService;

import java.util.Scanner;

public class Controller {
    private static IStudentService iStudentService = new StudentService();
    private static ITeacherService iTeacherService = new TeacherService();
    private static Scanner scanner = new Scanner(System.in);

    public static void menu() {
        while (true) {
            System.out.println("-----------CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN -----------");
            System.out.println("Chọn chức năng theo số (để tiếp tục): ");
            System.out.println("1. Thêm mới học sinh hoặc giảng viên");
            System.out.println("2. Xóa học sinh hoặc giảng viên");
            System.out.println("3. Xem danh sách học sinh hoặc giảng viên");
            System.out.println("4. Tìm kiếm gần đúng theo tên hoặc tìm kiếm đúng theo mã");
            System.out.println("5. Thoát");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Chọn chức năng theo số: ");
                    System.out.println("1. Thêm mới học sinh.");
                    System.out.println("2. Thêm mới giảng viên.");
                    int add = Integer.parseInt(scanner.nextLine());
                    switch (add) {
                        case 1:
                            iStudentService.addStudent();
                            break;
                        case 2:
                            iTeacherService.addTeacher();
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Chọn chức năng theo số: ");
                    System.out.println("1. Xóa học sinh.");
                    System.out.println("2. Xóa giảng viên.");
                    int remove = Integer.parseInt(scanner.nextLine());
                    switch (remove) {
                        case 1:
                            iStudentService.removeStudent();
                            break;
                        case 2:
                            iTeacherService.removeTeacher();
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Chọn chức năng theo số: ");
                    System.out.println("1. Xem danh sách học sinh.");
                    System.out.println("2. Xem danh sách giảng viên.");
                    int display = Integer.parseInt(scanner.nextLine());
                    switch (display) {
                        case 1:
                            iStudentService.studentsList();
                            break;
                        case 2:
                            iTeacherService.teachersList();
                            break;
                    }
                    break;
                case 4:
                    System.out.println("Chọn chức năng theo số: ");
                    System.out.println("1. Tìm kiếm học sinh.");
                    System.out.println("2. Tìm kiếm giảng viên.");
                    int seach = Integer.parseInt(scanner.nextLine());
                    switch (seach) {
                        case 1:
                            System.out.println("Chọn chức năng theo số: ");
                            System.out.println("1. Tìm kiếm gần đúng theo tên.");
                            System.out.println("2. Tìm kiếm đúng theo mã.");
                            int seachStudent = Integer.parseInt(scanner.nextLine());
                            switch (seachStudent) {
                                case 1:
                                    System.out.println("Nhập tên học sinh cần tìm");
                                    String nameStudent = scanner.nextLine();
                                    iStudentService.seachByName(nameStudent);
                                    break;
                                case 2:
                                    System.out.println("Nhập mã học sinh cần tìm");
                                    String idStudent = scanner.nextLine();
                                    iStudentService.seachById(idStudent);
                                    break;
                            }
                            break;
                        case 2:
                            System.out.println("Chọn chức năng theo số: ");
                            System.out.println("1. Tìm kiếm gần đúng theo tên.");
                            System.out.println("2. Tìm kiếm đúng theo mã.");
                            int seachTeacher = Integer.parseInt(scanner.nextLine());
                            switch (seachTeacher) {
                                case 1:
                                    System.out.println("Nhập tên giảng viên cần tìm");
                                    String nameTeacher = scanner.nextLine();
                                    iTeacherService.seachByName(nameTeacher);
                                    break;
                                case 2:
                                    System.out.println("Nhập tên giảng viên cần tìm");
                                    String idTeacher = scanner.nextLine();
                                    iTeacherService.seachById(idTeacher);
                                    break;
                            }
                            break;
                    }
                    break;
                case 5:
                    return;
            }
        }
    }
}
