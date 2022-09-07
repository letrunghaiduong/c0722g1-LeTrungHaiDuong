package ss3_Array.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementToArray {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.print("Nhập kích thước mảng: ");
        int size = Integer.parseInt(SC.nextLine());
        int[] array = new int[size];
        for (int i = 0; i < size; i++){
            System.out.print("Nhập phần tử thứ " + (i+1) + ": ");
            array[i] = Integer.parseInt(SC.nextLine());
        }
        System.out.print("Nhập phần tử cần chèn: ");
        int number = Integer.parseInt(SC.nextLine());
        System.out.print("Nhập vị trí muốn chèn: ");
        int index = Integer.parseInt(SC.nextLine());

        int []array1 = new int[array.length +1];
        if (index <= -1 && index >= array.length-1){
            System.out.print("Không chèn được");
        }else {
            for (int i = 0; i < index; i++){
                array1[i] = array[i];
            }
            for (int i = index +1; i < array1.length; i++){
                array1[i] = array[i-1];
            }
            array1[index] = number;
            System.out.println(Arrays.toString(array1));
        }
    }
}
