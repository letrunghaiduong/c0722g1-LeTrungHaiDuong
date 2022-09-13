package ss6_Ke_thua.exercise.point2d_point3d;

import java.util.Arrays;

public class TestPoint2D {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(5,6);
        System.out.print(Arrays.toString(point2D.getXY()) + "\n");
        System.out.print(point2D.toString());
    }
}
