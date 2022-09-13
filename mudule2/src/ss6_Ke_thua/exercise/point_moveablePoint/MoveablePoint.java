package ss6_Ke_thua.exercise.point_moveablePoint;

public class MoveablePoint extends Point{
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MoveablePoint(float x, float y, float xspeed, float yspeed) {
        super(x, y);
        this.xSpeed = xspeed;
        this.ySpeed = yspeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        return new float[2];
    }

    @Override
    public String toString() {
        return "(" + getX() + "," + getY() +")\n" +"speed = " + "(" + xSpeed +"," + ySpeed+")\n";
    }
    public MoveablePoint move(){
        super.setX(super.getX() + xSpeed);
        super.setY(super.getY() + xSpeed);
        return this;
    }
}
