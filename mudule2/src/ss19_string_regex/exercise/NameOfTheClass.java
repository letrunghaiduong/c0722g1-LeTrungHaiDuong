package ss19_string_regex.exercise;

import java.util.Scanner;

public class NameOfTheClass {
    public static void main(String[] args) {
        String regex = "^[ACP]\\d{4}[GHIKLM)]$";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên lớp: ");
        String className = scanner.nextLine();
        if (className.matches(regex)){
            System.out.println("Tên lớp hợp lệ");
        }else {
            System.out.println("Tên lớp không hợp lệ");
        }
    }
}
