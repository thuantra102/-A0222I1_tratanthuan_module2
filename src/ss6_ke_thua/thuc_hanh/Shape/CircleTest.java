package ss6_ke_thua.thuc_hanh.Shape;

public class CircleTest {
    public static void main(String[] args) {
        Shape.Circle circle = new Shape.Circle();
        System.out.println(circle);
        circle = new Shape.Circle(3.5);
        System.out.println(circle);
        circle = new Shape.Circle(3.5, "Indigo", false);



    }
}
