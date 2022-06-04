package ss7_abstract_interface.bai_tap.Shape;

public class MainTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(4);
        shapes[1] = new Rectangle(3,5) ;
        shapes[2] = new Square(4);
        System.out.println("Size hiện tại chưa resize");
        for (Shape shape:
             shapes) {
            System.out.println(shape);

        }
        for (Shape shape: shapes) {
            if (shape instanceof Circle) {
                Circle c = (Circle) shape;
                c.Resize(40);
            } else  if( shape instanceof Rectangle) {
                Rectangle r = (Rectangle) shape;
                r.Resize(40);
            } else  {
                Square square = (Square) shape;
                square.Resize(40);
            }
        }
        System.out.println("Các hình sau khi resize 40%");
        for (Shape shape:
                shapes) {
            System.out.println(shape);

        }

    }
}
