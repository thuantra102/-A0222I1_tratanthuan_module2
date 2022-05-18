package ss1_java_introduction.bai_tap;

import java.util.Scanner;

public class HienThiLoiChao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Làm ơn nhập tên của bạn vào: ");
        String name = scanner.nextLine();
        System.out.printf("Hello %s", name);
    }
}
