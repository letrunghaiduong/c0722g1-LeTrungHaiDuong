package ss15_debug.exercise;

import java.util.Scanner;

public class TriangleEdgesCheck{
    public static void checkTriangleEdges(double a, double b, double c) throws IllegalTriangleException {
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalTriangleException("Loi: Tam giac khong hop le!");
        } else {
            System.out.println("Tam giac hop le!");
        }
    }
    public static void checkTriangEdges2(double n) throws IllegalTriangleException {
        if (n < 0) {
            throw new IllegalTriangleException("Cạnh không hợp lệ");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TriangleEdgesCheck check = new TriangleEdgesCheck();
        double a,b,c;
        while (true){
            try {
                System.out.println("Nhập cạnh A: ");
                a = scanner.nextDouble();
                check.checkTriangEdges2(a);
                break;
            }catch (IllegalTriangleException | NumberFormatException e){
                System.out.println(e.getMessage());
            }
        }
        while (true){
            try {
                System.out.println("Nhập cạnh B: ");
                b = scanner.nextDouble();
                check.checkTriangEdges2(b);
                break;
            }catch (IllegalTriangleException | NumberFormatException e){
                System.out.println(e.getMessage());
            }
        }
        while (true){
            try {
                System.out.println("Nhập cạnh C: ");
                c = scanner.nextDouble();
                check.checkTriangEdges2(c);
                break;
            }catch (IllegalTriangleException | NumberFormatException e){
                System.out.println(e.getMessage());
            }
        }
        try {
            checkTriangleEdges(a,b,c);
            System.out.println("Khôn phải cạnh tam giác");
        }catch (IllegalTriangleException e){
            System.out.println(e.getMessage());
        }
    }
}
