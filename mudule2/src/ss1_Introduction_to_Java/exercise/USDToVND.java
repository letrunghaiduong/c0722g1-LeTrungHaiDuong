package ss1_Introduction_to_Java.exercise;

import java.util.Scanner;

public class USDToVND {
    public static void main(String[] args) {
        int rate = 23000;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số USD: ");
        int USD = scanner.nextInt();
        System.out.print("Quy đổi " + USD*rate + " VND");
    }
}
