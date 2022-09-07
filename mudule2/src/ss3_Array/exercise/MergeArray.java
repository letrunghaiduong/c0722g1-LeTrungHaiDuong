package ss3_Array.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.print("Nhập kích thước mảng 1: ");
        int size1 = Integer.parseInt(SC.nextLine());
        int[] array1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            array1[i] = Integer.parseInt(SC.nextLine());
        }
        System.out.print("Nhập kích thước mảng 2: ");
        int size2 = Integer.parseInt(SC.nextLine());
        int[] array2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            array2[i] = Integer.parseInt(SC.nextLine());
        }
        int size3 = size1 + size2;
        int[] array3 = new int[size3];
        int i = 0;
        for (int element : array1) {
            array3[i] = element;
            i++;
        }
        for (int element : array2) {
            array3[i] = element;
            i++;
        }
        System.out.println(Arrays.toString(array3));
    }
}
