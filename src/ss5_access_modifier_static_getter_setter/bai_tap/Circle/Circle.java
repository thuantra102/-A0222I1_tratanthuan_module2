package ss5_access_modifier_static_getter_setter.bai_tap.Circle;

public class Circle {
    private double radius = 1.0;
    private String color = "Blue";
    static double PI =  3.14;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    private double getArea() {
        return radius* radius * PI;
    }
    public double getPrivateArea() {
       return getArea();
    }

    public static void main(String[] args) {
        Circle circle = new Circle(4);
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());
        Circle circle1 = new Circle();
        System.out.println(circle1.radius);
    }
}
