package ss7_abstract_class_interface.exercise.interface_colorable;

public class Test {
    public static void main(String[] args) {
        Colorable[] colorable = new Colorable[4];
        colorable[0] = new Square(5);
        colorable[1] = new Circle(6);
        colorable[2] = new Circle(7);
        colorable[3] = new Square(8);
        for (Colorable colorable1 : colorable){
            System.out.print(colorable1+ "\n");
            if (colorable1 instanceof Square){
                System.out.println(colorable1.howToColor());
            }
        }
    }
}
