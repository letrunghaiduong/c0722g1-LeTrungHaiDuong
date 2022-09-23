package ss14_search_algorithm.exercise;

import java.util.Scanner;

public class InsertionSortByStep {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.print("Nhập kích thước mảng: ");
        int size = Integer.parseInt(SC.nextLine());
        int[] array = new int[size];
        for (int i = 0; i < size; i++){
            System.out.print("Nhập phần tử thứ " + (i+1) + ": ");
            array[i] = Integer.parseInt(SC.nextLine());
        }
        System.out.println("\nBắt đầu xử lý sắp xếp...");
        insertionSortByStep(array);
    }
    public static void insertionSortByStep(int[] array){
        int pos, x;
        for(int i = 1; i < array.length; i++){
            x = array[i];
            pos = i;
            while(pos > 0 && x < array[pos-1]){
                array[pos] = array[pos-1];
                pos--;
            }
            array[pos] = x;
        }
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }
}
