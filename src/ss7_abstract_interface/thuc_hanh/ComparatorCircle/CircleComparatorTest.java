package ss7_abstract_interface.thuc_hanh.ComparatorCircle;

import java.util.Arrays;
import java.util.Comparator;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(2);
        circles[1] = new Circle(7);
        circles[2] = new Circle(0);
        System.out.println("Trước khi sắp xếp");
        for (Circle c: circles) {
            System.out.println(c);
        }
        System.out.println("Sau khi sắp xếp");
        Comparator compare = new Compare();
        Arrays.sort(circles,compare);
        for (Circle c: circles) {
            System.out.println(c);
        }
    }
}
