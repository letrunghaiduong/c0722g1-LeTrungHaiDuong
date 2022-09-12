package ss5_Access_modifier.exercise.circle;

import ss5_Access_modifier.exercise.circle.Circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.getArea());
    }
}
