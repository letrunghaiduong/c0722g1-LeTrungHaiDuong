package ss11_DSA_stack_queue.exercise.Invert_element;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        System.out.print("Nhập kích thước mảng : ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            array[i] = Integer.parseInt(scanner.nextLine());
            stack.push(array[i]);
        }
        System.out.println("Mảng: "+ Arrays.toString(array));
        System.out.println("Mảng đảo ngược: ");
        for (int i = 0; i < size; i++) {
            System.out.print(stack.pop()+", ");
        }
    }
}
