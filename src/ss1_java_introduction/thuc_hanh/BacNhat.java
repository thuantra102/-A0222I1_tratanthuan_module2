package ss1_java_introduction.thuc_hanh;

import java.util.Scanner;

public class BacNhat {
    public static void main(String[] args) {
        System.out.println("Phương trình có dạng 'a*x + b = c, hãy bấm enter để nhập ba biến sau");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a: ");
        double a = scanner.nextFloat();
        System.out.println("Nhập b: ");
        double b = scanner.nextFloat();
        System.out.println("Nhập c: ");
        double c = scanner.nextFloat();
        if(a != 0) {
            double answer = (c - b)/a;
            System.out.println("Kết quả là" + answer);
        } else {
            if(b == c) {
                System.out.print("Vô số nghiệm ");
            } else {
                System.out.print("Vô nghiệm");
            }
        }

    }
}
