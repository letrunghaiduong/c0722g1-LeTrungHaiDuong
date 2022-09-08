package ss3_Array.exercise;

import java.util.Scanner;

public class SumTheNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width, height;
        System.out.println("Nhập vào số dòng: ");
        width = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào số cột: ");
        height = Integer.parseInt(scanner.nextLine());

        int array[][] = new int[width][height];
        System.out.println("Nhập các phần tử : ");
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                System.out.print("array[" + i + "]["+ j + "] = ");
                array[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }

        System.out.print("Nhập cột muốn tính tổng: ");
        int heightSum = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        for (int i = 0; i < array.length; i++){
                sum += array[i][heightSum];
        }
        System.out.print("Tổng cột " + heightSum+ " là: "+ sum);
    }
}
