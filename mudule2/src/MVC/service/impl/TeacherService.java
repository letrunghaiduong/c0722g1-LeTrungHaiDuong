package MVC.service.impl;

import MVC.model.Student;
import MVC.model.Teacher;
import MVC.service.ITeacherService;
import MVC.service.ulti.Check;
import MVC.service.ulti.WrongInputException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherService implements ITeacherService {
    private static Scanner scanner = new Scanner(System.in);
    public static List<Teacher> teacherList = new ArrayList<>();

    @Override
    public void addTeacher() throws IOException {
        getAllTeacherFromFile();
        Teacher teacher = this.infoTeacher();
        teacherList.add(teacher);
        System.out.println("Da them moi giang vien thanh cong");
        writeFile(teacherList);
    }

    @Override
    public void removeTeacher() {
        System.out.println("Nhập mã giảng viên muốn xóa: ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean flagDelete = false;
        for (int i = 0; i < teacherList.size(); i++) {
            if (teacherList.get(i).getId()==(id)) {
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

    private List<Teacher> getAllTeacherFromFile()throws IOException {
        File file = new File("src\\MVC\\data\\student.csv");
        BufferedReader reader = new BufferedReader(new FileReader(file));

        Teacher teacher;
        String line;
        String[] info;
        while ((line = reader.readLine()) != null){
            info = line.split(",");
            teacher = new Teacher(Integer.parseInt(info[0]), info[1],info[2],info[3],info[4]);
            teacherList.add(teacher);
        }
        reader.close();
        return teacherList;
    }

    private void writeFile(List<Teacher> teacherList)throws IOException{
        File file = new File("src\\MVC\\data\\student.csv");
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        for (Teacher teacher: teacherList){
            writer.write(teacher.getInfo());
            writer.newLine();
        }
        writer.close();
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
    public void seachById(int idTeacher) {
        boolean check = false;
        for (int i = 0; i < teacherList.size(); i++){
            if (teacherList.get(i).getId()==(idTeacher)){
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
                    if (teacherList.get(i).getId()-(teacherList.get(i + 1).getId()) > 0){
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
        int id;
        String name;
        while (true){
            try{
                System.out.print("Mời bạn nhập mã giáo viên: ");
                id = Integer.parseInt(scanner.nextLine());
                break;
            }catch (NumberFormatException e){
                System.out.println("Mã không hợp lệ, nhập lại: ");
            }
        }
        while (true){
            try{
                System.out.print("Mời bạn nhập tên giáo viên: ");
                name = scanner.nextLine();
                Check.checkName(name);
                break;
            }catch (WrongInputException e){
                System.out.println(e.getMessage());
            }
        }
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
