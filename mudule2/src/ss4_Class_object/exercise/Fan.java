package ss4_Class_object.exercise;

import java.util.Scanner;

public class Fan {
    final int SLOW = 1, MEDIUM = 2, FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "Blue";

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean getOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
    public Fan(){
    }

    @Override
    public String toString() {
        if (on == true){
            return "Fan in on{" +
                    "  speed=" + speed +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        }else {
            return "Fan in off{" +
                    "  radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        Fan fan = new Fan();
        System.out.print("Speed: ");
        fan.speed = Integer.parseInt(SC.nextLine());
        System.out.print("Radius: ");
        fan.radius = Integer.parseInt(SC.nextLine());
        System.out.print("Color: ");
        fan.color = SC.nextLine();
        System.out.println("\nStatus(true or flase): ");
        fan.on = SC.hasNextBoolean();
        System.out.print(fan.toString());
    }
}
