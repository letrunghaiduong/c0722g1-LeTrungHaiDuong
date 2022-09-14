package ss7_abstract_class_interface.exercise.interface_colorable;

public class Square implements Colorable{
    @Override
    public String howToColor() {
        return "Color all four sides..";
    }
    private double side = 1.0;

    public Square(double side) {
        this.side = side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public double getSide() {
        return this.side;
    }

    public double getArea(){
        return side*side;
    }
    public String toString() {
        return "SquareArea = " + getArea() +"\t";
    }
}
