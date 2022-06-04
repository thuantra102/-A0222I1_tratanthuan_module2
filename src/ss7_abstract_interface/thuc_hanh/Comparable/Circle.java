package ss7_abstract_interface.thuc_hanh.Comparable;

public class Circle implements Comparable<Circle> {
    private double radius = 1.0;
    private String color = "Blue";
    private Boolean Fill = true;
    public Circle() {
    }


    public Circle(double radius, String color, Boolean Fill) {
        this.radius = radius;
        this.color = color;
        this.Fill = Fill;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Boolean getFill() {
        return Fill;
    }

    public void setFill(Boolean fill) {
        Fill = fill;
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

    @Override
    public int compareTo(Circle o) {
        if(radius > o.getRadius())
            return 1;
        else if(radius < o.getRadius())
            return  -1;

        return 0;

    }
}
