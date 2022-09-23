package MVC.service.impl;

import MVC.model.Student;
import MVC.service.IStudentService;

import java.util.*;

public class StudentService implements IStudentService {
    Scanner scanner = new Scanner(System.in);
    List<Student> studentList = new ArrayList<>();
    public void student(){
        Student student0 = new Student("12","Duong","26/7","Nam","C07",9);
        Student student1 = new Student("8","Duong","20/7","Nam","C07",8);
        Student student2 = new Student("35","Duy","21/7","Nam","C07",10);
        Student student3 = new Student("22","Hoang","1/7","Nam","C07",5);
        Student student4 = new Student("47","Quan","12/7","Nam","C07",3);
        studentList.add(student0);
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
    }


    @Override
    public void addStudent() {
        Student student = this.infoStudent();
        studentList.add(student);
        System.out.println("Thêm mới thành công");
    }

    @Override
    public void removeStudent() {
        System.out.print("Mời bạn nhập mã học sinh cần xóa: ");
        String id = scanner.nextLine();
        boolean flagDelete = false;
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId().equals(id)) {
                System.out.println("Bạn có chắc muốn xóa học sinh này không? Nhập Y: yes, N: no");
                String choice = scanner.nextLine();
                if (choice.equals("Y")) {
                    studentList.remove(i);
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
    public void studentsList() {
        student();
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    @Override
    public void seachByName(String nameStudent) {
        boolean check = false;
        for (int i = 0; i < studentList.size(); i++){
            if (studentList.get(i).getName().contains(nameStudent)){
                System.out.println(studentList.get(i));
                check = true;
            }
        }
        if (!check){
            System.out.println("Không tìm thấy học sinh ");
        }
    }

    @Override
    public void seachById(String idStudent) {
        boolean check = false;
        for (int i = 0; i < studentList.size(); i++){
            if (studentList.get(i).getId().equals(idStudent)){
                System.out.println(studentList.get(i));
                check = true;
            }
        }
        if (!check){
            System.out.println("Không tìm thấy học sinh ");
        }
    }

    @Override
    public void sortStudents() {
        boolean check = true;
        for (int n = 1; n < studentList.size() && check; n++){
            check = false;
            for (int i = 0; i < studentList.size() - n; i++) {
                Student temp = studentList.get(i);
                int compareName = studentList.get(i).getName().compareTo(studentList.get(i + 1).getName());
                if (compareName > 0){
                    studentList.set(i,studentList.get(i+1));
                    studentList.set(i+1,temp);
                    check = true;
                }
                if (compareName == 0){
                    if (studentList.get(i).getId().compareTo(studentList.get(i + 1).getId()) < 0){
                        studentList.set(i,studentList.get(i+1));
                        studentList.set(i+1,temp);
                    }
                    check = true;
                }
            }
        }
        System.out.println("Sau khi sắp xếp: ");
        for (Student student : studentList) {
            System.out.println(student);
        }
    }


    public Student infoStudent() {
        System.out.print("Mời bạn nhập mã học sinh: ");
        String id = scanner.nextLine();
        System.out.print("Mời bạn nhập tên học sinh: ");
        String name = scanner.nextLine();
        System.out.print("Mời bạn nhập giới tính học sinh: ");
        String gender = scanner.nextLine();
        System.out.print("Mời bạn nhập tên lớp: ");
        String nameClass = scanner.nextLine();
        System.out.print("Mời bạn ngày sinh: ");
        String birthDay = scanner.nextLine();
        System.out.print("Mời bạn nhập điểm của học sinh: ");
        double score = Double.parseDouble(scanner.nextLine());
        Student student = new Student(id,name,birthDay,gender,nameClass,score);
        return student;
    }
}
