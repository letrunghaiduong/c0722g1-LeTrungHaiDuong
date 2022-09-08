package ss3_Array.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MinValueInArray {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.print("Nhập kích thước mảng : ");
        int size = Integer.parseInt(SC.nextLine());
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            array[i] = Integer.parseInt(SC.nextLine());
        }
        System.out.println("Mảng: "+ Arrays.toString(array));
        int min = array[0];
        for (int i = 1; i < array.length; i++){
            if (min > array[i]){
                min = array[i];
            }
        }
        System.out.print("Phần tử bé nhất trong mảng là: "+ min);
    }
}
