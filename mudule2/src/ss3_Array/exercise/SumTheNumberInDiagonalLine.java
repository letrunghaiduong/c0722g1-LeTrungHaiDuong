package ss3_Array.exercise;

import java.util.Scanner;

public class SumTheNumberInDiagonalLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width, height;
        do {
            System.out.println("Nhập vào số dòng: ");
            width = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập vào số cột: ");
            height = Integer.parseInt(scanner.nextLine());
            if (width != height){
                System.out.print("Số dòng không bằng số cột, xin nhập lại");
            }
        }while (width != height);

        int array[][] = new int[width][height];
        System.out.println("Nhập các phần tử : ");
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                System.out.print("array[" + i + "]["+ j + "] = ");
                array[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        System.out.print("Mảng vừa nhập: "+"\n");
        for (int i = 0; i < width; i++){
            for (int j = 0; j < height; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if (i == j){
                    sum += array[i][j];
                }
            }
        }
        System.out.print("Tổng các phần tử ở hàng chéo: " + sum);
    }
}
