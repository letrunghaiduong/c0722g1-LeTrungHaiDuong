package ss2_Loop.exercise;

import java.util.Scanner;

public class PrimeNumberDisplay {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.print("Nhập lưu lượng số nguyên tố: ");
        int numbers = SC.nextInt();
        int number = 2;
        int count = 0;
        int check = 0;
        String text = "";
        while (count <= numbers) {
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    check++;
                }
            }
            if (check == 2) {
                count++;
                text += number + ", ";
            }
            number++;
            check = 0;
        }
        System.out.println(numbers + " số nguyên tố đầu tiên: " + text);
    }
}
