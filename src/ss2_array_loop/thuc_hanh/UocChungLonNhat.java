package ss2_array_loop.thuc_hanh;

import java.util.Scanner;

public class UocChungLonNhat {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a");
        a = scanner.nextInt();
        System.out.println("Nhập b");
        b = scanner.nextInt();
        if (a == 0 || b == 0) {
            System.out.println("Không có ước chung lớn nhất");
        } else  {
            while (a != b) {
                if(a > b) {
                    a = a - b;
                } else  {
                    b = b -a;
                }
            }
            System.out.println("Uocs chung lớn nhất của a và b  là " + a);
        }

    }
}
