package ss2_Loop.exercise;

import java.util.Scanner;

public class PrimeNumbersLessThan100 {
    public static void main(String[] args) {
        int number = 2;
        int count = 0;
        String text = "";
        while (number <= 100) {
            for (int i = 1; i <= 100; i++) {
                if (number % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                text += number + ", ";
            }
            number++;
            count = 0;
        }
        System.out.println("Các số nguyên tố bé hơn 100: " + text);

    }
}
