package ss6_Ke_thua.exercise.point2d_point3d;

public class Point3D extends Point2D{
    private float z = 0.0f;
    public Point3D(float x, float y, float z)  {
        super(x, y);
        this.z = z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float getZ() {
        return z;
    }
    public void setXYZ(float x, float y, float z){
        setX(x);
        setY(y);
        this.z = z;
    }
    public float[] getXYZ(){
        return new float[]{getX(), getY(), this.z};
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + getX() +
                ", y=" + getY() +
                ", z=" + z +
                '}';
    }
}
