package ss7_abstract_interface.thuc_hanh.Comparable;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3);
        circles[1] = new Circle(2);
        circles[2] = new Circle(9);

        System.out.println("Before sort");
        for (Circle c : circles) {
            System.out.println(c);
        }

        Arrays.sort(circles);
        System.out.println("After sort");
        for (Circle c : circles){
            System.out.println(c);
        }

//        Arrays.sort(circles, new Comparator<Circle>() {
//            @Override
//            public int compare(Circle o1, Circle o2) {
//                if (o1.getRadius() > o2.getRadius())
//                    return 1;
//                else if (o1.getRadius() < o2.getRadius())
//                    return -1;
//
//                return 0;
//            }
//        });
//        System.out.println("After sort");
//        for (Circle c : circles) {
//            System.out.println(c);
//        }
    }
}
