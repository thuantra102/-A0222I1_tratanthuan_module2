package ss2_array_loop.thuc_hanh;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số của bạn vào ");
        int number = scanner.nextInt();
        boolean flag = true;
        if(number < 2) {
            flag = false;
        } else {
            for (int i = 2; i < number; i++) {
                if(number % i == 0) {
                    flag = false;
                    break;
                }
            }
        }
        if(flag) {
            System.out.println(number + " số nguyên tố");
        } else  {
            System.out.printf(number + " Không phải là số nguyên tố");
        }
    }
}
