package ss7_abstract_interface.bai_tap.Colorable;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(3);
        shapes[1] = new Square(4);
        for (Shape shape:
             shapes) {
            if (shape instanceof Square) {
                Colorable<S> s = (Square) shape;
                s.howToColor();
            } else {
                System.out.println(shape);
            }

        }


    }
}
