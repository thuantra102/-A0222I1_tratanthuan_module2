package ss6_ke_thua.thuc_hanh.Shape;

public class RectangleTest {
    public static void main(String[] args) {
        Shape.Rectangle rectangle = new Shape.Rectangle();
        System.out.println(rectangle);
        rectangle = new Shape.Rectangle(2.3, 5.8);
        System.out.println(rectangle);
        rectangle = new Shape.Rectangle("Orange", false, 2.5, 3.8  );
        System.out.println(rectangle);


    }
}
