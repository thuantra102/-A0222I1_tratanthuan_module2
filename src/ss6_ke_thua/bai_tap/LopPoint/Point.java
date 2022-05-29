package ss6_ke_thua.bai_tap.LopPoint;

public class Point {
    private float x = 0.0f;
    private float y = 0.0f;
    public Point() {
    }

    public  Point(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public  void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float[] getXY() {
        float[] arr = {this.x, this.y};
        return arr;
    }

    @Override
    public String toString() {
        return "( " + x + ", " + y + " )";
    }
}
class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void  setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed() {
        float arr[] = {xSpeed, ySpeed};
        return arr;
    }
    public void Move() {
       setxSpeed(getX() + this.xSpeed);
       setySpeed(getY() + this.ySpeed);
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                " With the Speed" + super.toString() ;
    }
}
class  Test {
    public static void main(String[] args) {
        Point point = new Point();
        point.setXY(5.3f,5.2f);
        System.out.println(point);
        MovablePoint movablePoint = new MovablePoint();
        movablePoint.setSpeed(1f,2f);
        movablePoint.setXY(5f,3f);
        movablePoint.Move();
        movablePoint.Move();
        movablePoint.Move();
        System.out.println(movablePoint);
    }
}
