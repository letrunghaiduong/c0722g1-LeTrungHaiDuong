package MVC.service.impl;

import MVC.model.Student;
import MVC.model.Teacher;
import MVC.service.ITeacherService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherService implements ITeacherService {
    private static Scanner scanner = new Scanner(System.in);
    public static List<Teacher> teacherList = new ArrayList<>();

    public void teacher(){
        Teacher teacher1 = new Teacher("44","Hoa","1/1","Nữ","Toán");
        Teacher teacher2 = new Teacher("5","Hùng","1/1","Nam","Lý");
        Teacher teacher3 = new Teacher("50","Long","1/1","Nam","Hóa");
        Teacher teacher4 = new Teacher("15","Quốc","1/1","Nam","Văn");
        Teacher teacher5 = new Teacher("20","Nhi","1/1","Nữ","Sử");
        Teacher teacher6 = new Teacher("7","Dũng","1/1","Nam","Địa");
        Teacher teacher7 = new Teacher("18","Dũng","1/1","Nam","Địa");
        teacherList.add(teacher1);
        teacherList.add(teacher2);
        teacherList.add(teacher3);
        teacherList.add(teacher4);
        teacherList.add(teacher5);
        teacherList.add(teacher6);
        teacherList.add(teacher7);
    }

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
        teacher();
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

    @Override
    public void sortTeachers() {
        boolean check = true;
        for (int n = 1; n < teacherList.size() && check; n++){
            check = false;
            for (int i = 0; i < teacherList.size() - n; i++) {
                Teacher temp = teacherList.get(i);
                int compareName = teacherList.get(i).getName().compareTo(teacherList.get(i + 1).getName());
                if (compareName > 0){
                    teacherList.set(i,teacherList.get(i+1));
                    teacherList.set(i+1,temp);
                    check = true;
                }
                if (compareName == 0){
                    if (teacherList.get(i).getId().compareTo(teacherList.get(i + 1).getId()) < 0){
                        teacherList.set(i,teacherList.get(i+1));
                        teacherList.set(i+1,temp);
                    }
                    check = true;
                }
            }
        }
        System.out.println("Sau khi sắp xếp: ");
        for (Teacher teacher : teacherList) {
            System.out.println(teacher);
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
