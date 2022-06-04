package ss7_abstract_interface.bai_tap.Shape;

public class Rectangle extends Shape implements Resizeable{
    private double height = 1;
    private double length = 1;
    public Rectangle() {
    }
    public Rectangle(double height, double length) {
        this.height = height;
        this.length = length;
    }

    @Override
    public double getArea() {
        return height * length;
    }

    @Override
    public double getPerimeter() {
        return (height + length)/ 2;
    }


    public Rectangle(String color, boolean filled, double height, double length) {
        super(color, filled);
        this.height = height;
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void Resize(double percent) {
        this.height = (this.height *percent)/100;
        this.length = (this.length *percent)/100;

    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", length=" + length +
                '}';
    }
}
