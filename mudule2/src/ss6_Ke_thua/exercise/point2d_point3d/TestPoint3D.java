package ss6_Ke_thua.exercise.point2d_point3d;

import java.util.Arrays;

public class TestPoint3D {
    public static void main(String[] args) {
        Point3D point3D = new Point3D(7,8, 9);
        System.out.print(Arrays.toString(point3D.getXYZ()) + "\n");
        System.out.print(point3D.toString());
    }
}
