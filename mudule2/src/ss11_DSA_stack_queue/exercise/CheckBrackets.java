package ss11_DSA_stack_queue.exercise;

import java.util.Scanner;
import java.util.Stack;

public class CheckBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        System.out.println("Nhập biểu thức: ");
        String expression = scanner.nextLine();
        boolean check = true;
        for (int i = 0; i < expression.length(); i++){
            if (expression.charAt(i) == '(' ){
                stack.push(expression.charAt(i));
            }else if (expression.charAt(i) == ')' ){
                if (stack.isEmpty()){
                    check = false;
                    break;
                }else {
                    stack.pop();
                }
            }
        }
        if (!stack.isEmpty()) {
            check = false;
        }
        System.out.println(check);

    }
}
