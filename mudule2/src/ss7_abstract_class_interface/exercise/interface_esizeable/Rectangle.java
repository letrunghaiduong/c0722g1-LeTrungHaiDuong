package ss7_abstract_class_interface.exercise.interface_esizeable;

public class Rectangle implements Resizeable {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }


    public double getArea() {
        return width * this.length;
    }

    @Override
    public void resize(double percent) {
        setWidth(getWidth() + getWidth()*percent);
        setLength(getLength() + getLength()*percent);
    }

    @Override
    public String toString() {
        return "RectangleArea=" + getArea() + "\t";
    }


}
