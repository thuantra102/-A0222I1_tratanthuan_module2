package ss6_ke_thua.bai_tap.CircleAndCylinder;

public class Cylinder extends Circle {
        private double height = 3.0;
        public Cylinder() {
        }
        public Cylinder(double radius, String color, double height) {
            super(radius, color);
            this.height = height;
        }
        public String toString() {
            return "This cylinder with height  " + height + super.toString();
        }
        public double GetVolume(){
            return getRadius()*2*3.14*this.height;
        }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
