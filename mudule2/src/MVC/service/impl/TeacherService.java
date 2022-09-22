package MVC.service.impl;

import MVC.model.Teacher;
import MVC.service.ITeacherService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherService implements ITeacherService {
    private static Scanner scanner = new Scanner(System.in);
    public static List<Teacher> teacherList = new ArrayList<>();

    @Override
    public void addTeacher() {
        Teacher teacher = this.infoTeacher();
        teacherList.add(teacher);
        System.out.println("Da them moi giang vien thanh cong");
    }

    @Override
    public void removeTeacher() {
        System.out.println("Nhập mã giảng viên muốn xóa: ");
        String id = scanner.nextLine();
        boolean flagDelete = false;
        for (int i = 0; i < teacherList.size(); i++) {
            if (teacherList.get(i).getId().equals(id)) {
                System.out.println("Bạn có chắc muốn xóa GV này không? Nhập Y: yes, N: no");
                String choice = scanner.nextLine();
                if (choice.equals("Y")) {
                    teacherList.remove(i);
                    System.out.println("Xóa thành công");
                }
                flagDelete = true;
                break;
            }
        }
        if (!flagDelete) {
            System.out.println("Không tìm thấy đối tượng cần xóa.");
        }
    }

    @Override
    public void teachersList() {
        for (Teacher teacher : teacherList) {
            System.out.println(teacher);
        }
    }

    @Override
    public void seachByName(String nameTeacher) {
        boolean check = false;
        for (int i = 0; i < teacherList.size(); i++){
            if (teacherList.get(i).getName().contains(nameTeacher)){
                System.out.println(teacherList.get(i));
                check = true;
            }
        }
        if (!check){
            System.out.println("Không tìm thấy giảng viên ");
        }
    }

    @Override
    public void seachById(String idTeacher) {
        boolean check = false;
        for (int i = 0; i < teacherList.size(); i++){
            if (teacherList.get(i).getId().equals(idTeacher)){
                System.out.println(teacherList.get(i));
                check = true;
            }
        }
        if (!check){
            System.out.println("Không tìm thấy giảng viên ");
        }
    }

    public Teacher infoTeacher() {
        System.out.print("Mời bạn nhập mã giảng viên: ");
        String id = scanner.nextLine();
        System.out.print("Mời bạn nhập tên giảng viên: ");
        String name = scanner.nextLine();
        System.out.print("Mời bạn nhập giới tính giảng viên: ");
        String gender = scanner.nextLine();
        System.out.print("Mời bạn ngày sinh giảng viên: ");
        String birthDay = scanner.nextLine();
        System.out.print("Mời bạn nhập chuyên môn: ");
        String specialize = scanner.nextLine();
        Teacher teacher = new Teacher(id, name, birthDay, gender, specialize);
        return teacher;
    }
}
