package ss11_DSA_stack_queue.exercise;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> stack = new Stack<>();
        System.out.println("Nhập số thập phân: ");
        int number = Integer.parseInt(scanner.nextLine());
        while (number > 0){
            int count = number % 2;
            stack.push(count+ "");
            number = number/2;
        }
        System.out.println("Chuyển sang nhị phân: ");
        int n = stack.size();
        for (int i = 0; i < n; i++){
            System.out.print(stack.pop());
        }
    }
}
