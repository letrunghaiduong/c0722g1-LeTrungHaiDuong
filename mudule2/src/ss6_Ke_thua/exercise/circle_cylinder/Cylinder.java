package ss6_Ke_thua.exercise.circle_cylinder;

public class Cylinder extends Circle{
    private double height;
    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
    public double getArea(){
        return (2*Math.PI*getRadius()*getRadius())+(2*Math.PI*getRadius()*getHeight());
    }
    public double getVolume(){
        return (Math.PI*getRadius()*getRadius()*getHeight());
    }

    @Override
    public String toString() {
        return "Cylinder{" +"\n" +
                "Color =" + getColor() + "\n" +
                "Radius =" + getRadius() + "\n" +
                "height =" + height + "\n" +
                "Area =" + getArea() +"\n" +
                "Volum =" + getVolume()+"\n" +
                '}';
    }
}
