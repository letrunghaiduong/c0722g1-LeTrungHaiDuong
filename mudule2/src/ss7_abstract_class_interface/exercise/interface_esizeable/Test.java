package ss7_abstract_class_interface.exercise.interface_esizeable;

import ss7_abstract_class_interface.exercise.interface_esizeable.Circle;
import ss7_abstract_class_interface.exercise.interface_esizeable.Rectangle;
import ss7_abstract_class_interface.exercise.interface_esizeable.Resizeable;
import ss7_abstract_class_interface.exercise.interface_esizeable.Square;

public class Test {
    public static void main(String[] args) {
        double x = (double) (Math.random() * 1);
        System.out.print("Trước khi thay đổi\n:");
        Resizeable[] resizeables = new Resizeable[3];
        resizeables[0] = new Circle(5);
        resizeables[1] = new Rectangle(5,6);
        resizeables[2] = new Square(7);
        for (Resizeable a : resizeables){
            System.out.print(a);
        }
        System.out.println("\n");
        System.out.println("Sau khi thay đổi:");
        for (Resizeable a : resizeables){
            a.resize(x);
            System.out.print(a);
        }
    }
}
