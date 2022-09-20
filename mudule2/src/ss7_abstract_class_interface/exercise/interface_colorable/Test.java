package ss7_abstract_class_interface.exercise.interface_colorable;

public class Test {
    public static void main(String[] args) {
        Circle circle1 = new Circle(6);
        System.out.println(circle1);
        Circle circle2 = new Circle(7);
        System.out.println(circle2);
        Square square = new Square(5);
        System.out.println(square);
        System.out.println(square.howToColor());
        Square square1 = new Square(8);
        System.out.println(square1);
        System.out.println(square1.howToColor());


    }
}
