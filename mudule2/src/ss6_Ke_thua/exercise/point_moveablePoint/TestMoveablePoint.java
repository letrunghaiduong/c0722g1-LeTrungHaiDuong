package ss6_Ke_thua.exercise.point_moveablePoint;

public class TestMoveablePoint {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint(3,4,5,6);
        System.out.print(moveablePoint.toString());
        System.out.print(moveablePoint.move());

    }
}
