package ss7_abstract_interface.bai_tap.Colorable;

import ss7_abstract_interface.bai_tap.Colorable.Shape;


public class Circle extends Shape {
    private double radius = 1.0;

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "Area = " +getArea() + '}';
    }






}
