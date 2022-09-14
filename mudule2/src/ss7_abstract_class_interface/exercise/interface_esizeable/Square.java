package ss7_abstract_class_interface.exercise.interface_esizeable;

public class Square implements Resizeable {
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
        return side * side;
    }

    @Override
    public void resize(double percent) {
        setSide(getSide() + getSide()*percent);
    }

    @Override
    public String toString() {
        return "SquareArea = " + getArea() +"\n";
    }
}

