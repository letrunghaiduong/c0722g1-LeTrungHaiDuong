package ss7_abstract_class_interface.exercise.interface_colorable;

public class Circle implements Colorable{
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
    public String toString() {
        return "CircleArea =" + getArea() +"\t";
    }

    @Override
    public String howToColor() {
        return null;
    }
}

