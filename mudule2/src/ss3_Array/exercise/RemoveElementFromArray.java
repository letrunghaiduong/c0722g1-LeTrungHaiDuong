package ss3_Array.exercise;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveElementFromArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhập kích thước mảng: ");
            size = Integer.parseInt(scanner.nextLine());
            if (size > 20)
                System.out.println("Kích thước không quá 20: ");
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Nhập phần tử thứ" + (i + 1) + " : ");
            array[i] = Integer.parseInt(scanner.nextLine());
            i++;
        }
        System.out.print("Array: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        System.out.print("Nhập phần tử muốn xóa: ");
        int number = Integer.parseInt(scanner.nextLine());

        for (i = 0; i < array.length; i++) {
            if (number == array[i]) {
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[array.length - 1] = 0;
                i--;
            }
        }
        System.out.println(Arrays.toString(array));;
    }
}
