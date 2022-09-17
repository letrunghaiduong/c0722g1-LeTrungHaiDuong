package MVC.view;

import MVC.controller.StudentController;
import MVC.controller.TeacherController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập chức năng theo số");
        System.out.println("1. Học sinh");
        System.out.println("2. Giảng viên");
        int choice = Integer.parseInt(scanner.nextLine());

        switch (choice){
            case 1:
                StudentController.menuStudent();
            case 2:
                TeacherController.menuTeacher();
        }


    }
}
