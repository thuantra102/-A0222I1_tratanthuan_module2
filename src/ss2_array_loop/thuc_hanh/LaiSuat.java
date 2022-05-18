package ss2_array_loop.thuc_hanh;

import java.util.Scanner;

public class LaiSuat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tienGoi = 1.0, laiSuat = 1.0;
        int thang = 1;
        System.out.println("Nhập số tiền gỏi");
        tienGoi = scanner.nextDouble();
        System.out.println("Nhập số tháng gởi");
        thang = scanner.nextInt();
        System.out.println("Nhập phận trăm lãi suất");
        laiSuat = scanner.nextDouble();
        double tongLaiSuat = 0;
        for (int i = 1; i <= thang ; i++) {
            tongLaiSuat += tienGoi * (laiSuat/100)/12 * thang;
        }
        System.out.println("Tổng số tiền lại bạn nhận được sau " + thang + " là " + tongLaiSuat + "triệu");


    }
}
