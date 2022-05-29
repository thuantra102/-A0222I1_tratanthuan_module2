package ss4_object.bai_tap.Fan;

public class Fan {
    private int slow = 1;
    private int medium = 2;
    private int fast = 3;
    private int speed = slow;
    private boolean on = false;
    private double radius =5;
    private  String color = "Xanh";

    public int getSlow() {
        return slow;
    }

    public void setSlow(int slow) {
        this.slow = slow;
    }

    public int getMedium() {
        return medium;
    }

    public void setMedium(int medium) {
        this.medium = medium;
    }

    public int getFast() {
        return fast;
    }

    public void setFast(int fast) {
        this.fast = fast;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
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

    public Fan() {
    }
    public String toString() {
        if (this.isOn()) {
            return "Máy quạt đang bật " + "Tốc độ hiện tại là " + this.getSpeed() + " Có màu là " + this.getColor()
                    + " Có bán kính là " + this.getRadius();
        }
        return "QUạt đang tắt " + "Có màu là " + this.getColor() + " và có bán kính là " + this.getRadius();
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(fan1.getFast());
        fan1.setRadius(10);
        fan1.setColor("Vàng");
        fan1.setOn(true);
        System.out.println(fan1.toString());
        Fan fan2 = new Fan();
        fan2.setSpeed(fan2.getSlow());
        fan2.setRadius(5);
        fan2.setColor("Đỏ");
        fan2.setOn(false);
        System.out.println(fan2.toString());

    }
}
