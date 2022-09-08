package ss3_Array.exercise;

import java.util.Scanner;

public class MaxValueIn2DimensionalArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width, height;
        System.out.println("Nhập vào số dòng: ");
        width = scanner.nextInt();
        System.out.println("Nhập vào số cột: ");
        height = scanner.nextInt();

        int array[][] = new int[width][height];
        System.out.println("Nhập các phần tử : ");
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                System.out.print("array[" + i + "]["+ j + "] = ");
                array[i][j] = scanner.nextInt();
            }
        }

        int max = array[0][0];
        for (int i = 0; i < array.length;i++){
            for (int j = 0; j < array[i].length; j++){
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }
        System.out.print("Giá trị lớn nhất trong mảng: " + max);
    }
}
