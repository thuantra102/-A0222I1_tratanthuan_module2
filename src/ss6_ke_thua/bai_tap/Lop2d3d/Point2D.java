package ss6_ke_thua.bai_tap.Lop2d3d;

import java.util.Arrays;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;
    public Point2D() {
    }

    public Point2D(float x, float y) {
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
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void  setXYZ(float x, float y , float z) {
        setXY(x,y);
        this.z = z;
    }
    public float[] getXYZ(){
        float[] res= Arrays.copyOf(getXY(),getXY().length+1);
        res[res.length-1] = this.z;
        return res;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                '}' + super.toString();
    }
}
class  Test {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        point2D.setXY(4.0f,2.3f);
        System.out.println(point2D);
        float arr[] = point2D.getXY();
        System.out.println(Arrays.toString(arr));
        Point3D point3D = new Point3D();
        System.out.println(point3D);
        System.out.println(Arrays.toString(point3D.getXYZ()));

    }
}
