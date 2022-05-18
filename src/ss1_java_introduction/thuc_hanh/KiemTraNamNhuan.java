package ss1_java_introduction.thuc_hanh;

import java.util.Scanner;

public class KiemTraNamNhuan {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập năm bạn muốn kiểm tra năm nhuận");
//        int year = scanner.nextInt();
//        if(year % 4 == 0) {
//            if(year % 100== 0) {
//                if(year % 400 == 0) {
//                    System.out.printf("%d là năm nhuận ", year);
//                } else  {
//                    System.out.printf("%d không phải là năm nhuận ", year);
//                }
//            } else  {
//                System.out.printf("%d là năm nhuận ", year);
//            }
//        } else  {
//            System.out.printf("%d không phải là năm nhuận ", year);
//        }
//    }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập năm bạn muốn kiểm tra năm nhuận");
            int year = scanner.nextInt();
            boolean isYear = false;
            if(year % 4 ==0) {
                if(year % 100 == 0) {
                    if(year % 400 == 0) {
                        isYear = true;
                    }
                } else {
                    isYear = true;
                }
            }
            if(isYear) {
                System.out.printf("%d là năm nhuận", year);
            } else {
                System.out.printf("%d không phải là năm nhuận %s", year);
            }
    }
}
