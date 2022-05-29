package ss6_ke_thua.bai_tap.CircleAndCylinder;

public class Circle {
    private double radius = 1.0;
    private String color = "Blue";
    public Circle() {
    }
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String toString() {
        return " This circle with radius " + radius + " and " + color + " color";
    }


}
