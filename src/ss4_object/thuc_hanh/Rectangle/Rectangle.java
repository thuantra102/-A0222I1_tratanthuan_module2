package ss4_object.thuc_hanh.Rectangle;

public class Rectangle {
    double width, height;

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Rectangle() {
    }
    public  Rectangle(double width, double height) {
        this.height = height;
        this.width = width;
    }
    public double getArea() {
        return (this.height + this.width) * 2;
    }
    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }
    public String display() {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }
}


