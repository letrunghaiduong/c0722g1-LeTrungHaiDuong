package ss19_string_regex.exercise;

import java.util.Scanner;

public class PhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "[(]\\d{2}[)]-[(]0\\d{9}[)]";

        System.out.println("Nhập số điện thoại: ");
        String phoneNumber = scanner.nextLine();
        if (phoneNumber.matches(regex)){
            System.out.println("Số điện thoại hợp lệ");
        }
        else {
            System.out.println("Số điện thoại không hợp lệ");

        }

    }
}
