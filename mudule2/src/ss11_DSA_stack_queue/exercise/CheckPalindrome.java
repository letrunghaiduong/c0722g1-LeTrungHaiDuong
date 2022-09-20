package ss11_DSA_stack_queue.exercise;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();

        System.out.println("Nhập chuỗi: ");
        String chain = scanner.nextLine();
        for (int i = 0; i < chain.length(); i++){
            queue.add(chain.charAt(i)+"");
            stack.push(chain.charAt(i)+"");
        }
        boolean check = false;
        int size = chain.length();
        for (int i = 0; i < size; i++){
            if (stack.pop().equals(queue.poll())){
                check = true;
            }
        }
        if (check){
            System.out.println("Là chuỗi Palindrome");
        }else {
            System.out.println("Không phải là chuỗi Palindrome");
        }
    }
}
