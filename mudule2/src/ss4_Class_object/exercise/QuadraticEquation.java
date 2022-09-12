package ss4_Class_object.exercise;

import java.util.Scanner;


public class QuadraticEquation {
    double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;

    }

    public double getB() {
        return this.b;

    }

    public double getC() {
        return this.c;

    }

    public double getDiscriminant() {
        double delta = b * b - 4 * a * c;
        return delta;
    }

    public double getRoot() {
        return (-b / (2 * a));
    }

    public double getRoot1() {
        return (-b + (Math.sqrt(b * b - 4 * a * c))) / 2 * a;

    }

    public double getRoot2() {
        return (-b - (Math.sqrt(b * b - 4 * a * c))) / 2 * a;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ax^2 + bx + c = 0 ");
        System.out.println("Nhập a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhập b: ");
        double b = scanner.nextDouble();
        System.out.println("Nhập c: ");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println("Root 1 = " + quadraticEquation.getRoot1());
            System.out.println("Root 2 = " + quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("Root 1 = Root 2 = " + quadraticEquation.getRoot());
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
