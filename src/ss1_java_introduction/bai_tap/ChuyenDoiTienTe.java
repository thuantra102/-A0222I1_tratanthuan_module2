package ss1_java_introduction.bai_tap;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền đô");
        double usd = scanner.nextDouble();
        double vnd = usd * 23000;
        System.out.println("Số tiên vnd là " + vnd + " vnd");
    }
}
