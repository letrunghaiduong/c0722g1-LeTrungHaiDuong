package MVC.service.impl;

import MVC.model.Student;
import MVC.service.IStudentService;
import MVC.service.ulti.Check;
import MVC.service.ulti.WrongInputException;
import ss16_file.exercise.read_file_.csv.Country;

import java.io.*;
import java.util.*;

public class StudentService implements IStudentService {
    Scanner scanner = new Scanner(System.in);
    List<Student> studentList = new ArrayList<>();


    @Override
    public void addStudent() throws IOException {
        studentList = getAllStudentFromFile();
        Student student = this.infoStudent();
        studentList.add(student);
        System.out.println("Thêm mới thành công");
        writeFile(studentList);
    }

    @Override
    public void removeStudent() {
        System.out.print("Mời bạn nhập mã học sinh cần xóa: ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean flagDelete = false;
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == (id)) {
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
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    @Override
    public void seachByName(String nameStudent) {
        boolean check = false;
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getName().contains(nameStudent)) {
                System.out.println(studentList.get(i));
                check = true;
            }
        }
        if (!check) {
            System.out.println("Không tìm thấy học sinh ");
        }
    }

    @Override
    public void seachById(int idStudent) {
        boolean check = false;
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == (idStudent)) {
                System.out.println(studentList.get(i));
                check = true;
            }
        }
        if (!check) {
            System.out.println("Không tìm thấy học sinh ");
        }
    }

    @Override
    public void sortStudents() {
        boolean check = true;
        for (int n = 1; n < studentList.size() && check; n++) {
            check = false;
            for (int i = 0; i < studentList.size() - n; i++) {
                Student temp = studentList.get(i);
                int compareName = studentList.get(i).getName().compareTo(studentList.get(i + 1).getName());
                if (compareName > 0) {
                    studentList.set(i, studentList.get(i + 1));
                    studentList.set(i + 1, temp);
                    check = true;
                }
                if (compareName == 0) {
                    if (studentList.get(i).getId() - (studentList.get(i + 1).getId()) > 0) {
                        studentList.set(i, studentList.get(i + 1));
                        studentList.set(i + 1, temp);
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

    private List<Student> getAllStudentFromFile()throws IOException {
        File file = new File("src\\MVC\\data\\student.csv");
        BufferedReader reader = new BufferedReader(new FileReader(file));

        Student student1;
        String line;
        String[] info;
        while ((line = reader.readLine()) != null){
            info = line.split(",");
            student1 = new Student(Integer.parseInt(info[0]), info[1],info[2],info[3],info[4],Double.parseDouble(info[5]));
            studentList.add(student1);
        }
        reader.close();
        return studentList;
    }

    private void writeFile(List<Student> studentList)throws IOException{
        File file = new File("src\\MVC\\data\\student.csv");
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        for (Student student: studentList){
            writer.write(student.getInfo());
            writer.newLine();
        }
        writer.close();
    }

    public Student infoStudent() {
        int id;
        String name;
        double score;
        while (true){
            try{
                System.out.print("Mời bạn nhập mã học sinh: ");
                id = Integer.parseInt(scanner.nextLine());
                break;
            }catch (NumberFormatException e){
                System.out.println("Mã không hợp lệ, nhập lại: ");
            }
        }
        while (true){
            try{
                System.out.print("Mời bạn nhập tên học sinh: ");
                name = scanner.nextLine();
                Check.checkName(name);
                break;
            }catch (WrongInputException e){
                System.out.println(e.getMessage());
            }
        }

        System.out.print("Mời bạn nhập giới tính học sinh: ");
        String gender = scanner.nextLine();
        System.out.print("Mời bạn nhập tên lớp: ");
        String nameClass = scanner.nextLine();
        System.out.print("Mời bạn ngày sinh: ");
        String birthDay = scanner.nextLine();
        while (true){
            try{
                System.out.print("Mời bạn nhập điểm của học sinh: ");
                score = Double.parseDouble(scanner.nextLine());
                Check.checkScore(score);
                break;
            }catch (WrongInputException e){
                System.out.println(e.getMessage());
            }
        }
        Student student = new Student(id, name, birthDay, gender, nameClass, score);
        return student;
    }
}
