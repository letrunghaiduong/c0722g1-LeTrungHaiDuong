package ss7_abstract_class_interface.exercise.interface_esizeable;

public class Circle implements Resizeable {
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

    @Override
    public void resize(double percent) {
        setRadius(getRadius() + percent*getRadius());
    }

    @Override
    public String toString() {
        return "CircleArea =" + getArea() +"\t";
    }
}
