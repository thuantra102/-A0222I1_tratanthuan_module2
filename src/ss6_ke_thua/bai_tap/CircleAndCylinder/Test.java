package ss6_ke_thua.bai_tap.CircleAndCylinder;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(5, "red");
        System.out.println(circle);
        circle.setColor("yellow");
        System.out.println(circle);
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        cylinder = new Cylinder(9.0,"Black",6);
        System.out.println(cylinder);
        System.out.println(circle);
        System.out.println(cylinder.GetVolume());
    }
}
