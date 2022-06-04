package ss7_abstract_interface.bai_tap.Shape;

public class Square extends Shape implements Resizeable{
    private double height = 1;

    public Square(double height) {
        this.height = height;
    }

    public Square() {
    }

    public Square(String color, boolean filled, double height) {
        super(color, filled);
        this.height = height;
    }

    @Override
    public void Resize(double percent) {
        this.height = (this.height * percent)/100;
    }

    @Override
    public double getArea() {
        return this.height * this.height;
    }

    @Override
    public double getPerimeter() {
        return this.height * 4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "height=" + height +
                '}';
    }
}
