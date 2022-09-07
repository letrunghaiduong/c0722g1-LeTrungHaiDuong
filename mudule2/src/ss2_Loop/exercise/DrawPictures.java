package ss2_Loop.exercise;

import java.util.Scanner;

public class DrawPictures {
    public static void main(String[] args) {
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle ");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");
        while (choice != 4){
            int number = scanner.nextInt();
            switch (number) {
                case 1:
                    System.out.println("1. Print the rectangle");
                    String text = "";
                    for (int i = 1; i <= 6; i++) {
                        for (int j = 1; j <= 6; j++) {
                            text += "*";
                        }
                        text += "\n";
                    }
                    System.out.println(text);
                    break;
                case 2:
                    System.out.println("2. Print the square triangle ");
                    String text2 = "";
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= i; j++) {
                            text2 += "*";
                        }
                        text2 += "\n";
                    }
                    System.out.println();

                    for (int i = 1; i <= 5; i++) {
                        for (int j = 5; j >= i; j--) {
                            text2 += "*";
                        }
                        text2 += "\n";
                    }
                    System.out.println();

                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= i; j++) {
                            text2 += " ";
                        }
                        for (int j = 5; j >= i; j--) {
                            text2 += "*";
                        }
                        text2 += "\n";
                    }
                    System.out.println();

                    for (int i = 1; i <= 5; i++) {
                        for (int j = 5; j >= i; j--) {
                            text2 += " ";
                        }
                        for (int j = 1; j <= i; j++) {
                            text2 += "*";
                        }
                        text2 += "\n";
                    }
                    System.out.println(text2);
                    break;
                case 3:
                    System.out.println("3. Print isosceles triangle");
                    String text3 = "";
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 5; j >= i; j--) {
                            text3 += " ";
                        }
                        for (int j = 1; j <= i * 2 - 1; j++) {
                            text3 += "*";
                        }
                        text3 += "\n";
                    }
                    System.out.println(text3);
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}
