package ss3_Array.exercise;

import java.util.Scanner;

public class SumNumberCharactersInString {
    public static void main(String[] args) {
        String str = "code gym module2";
        Scanner SC = new Scanner(System.in);
        System.out.print("Chuỗi: "+ str + "\n");
        System.out.print("Nhập ký tự cần đếm: ");
        char character = SC.nextLine().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++){
            if (character == str.charAt(i)){
                count++;
            }
        }
        System.out.print("Số ký tự "+ character +" trong chuỗi là: " + count);
    }
}
