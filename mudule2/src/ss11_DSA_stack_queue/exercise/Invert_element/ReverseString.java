package ss11_DSA_stack_queue.exercise.Invert_element;

import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> stack = new Stack<>();

        System.out.println("Nhập chuỗi: ");

        String chain = scanner.nextLine();
        for (int i = 0; i < chain.length(); i++){
            stack.push(chain.charAt(i) + "");
        }
        System.out.println("Chuỗi đảo ngược: ");
        for (int i = 0; i < chain.length(); i++){
            System.out.print(stack.pop());
        }
    }
}
