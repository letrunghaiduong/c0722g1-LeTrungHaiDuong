package ss6_Ke_thua.exercise.point_moveablePoint;

import java.util.Arrays;

public class TestPoint {
    public static void main(String[] args) {
        Point point = new Point(1,2);
        System.out.print(Arrays.toString(point.getXY()) + "\n");
        System.out.print(point.toString());
    }
}
