package ss2_array_loop.bai_tap;

import java.util.Scanner;

public class SoNguyenTo20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bạn muốn nhập bao nhiêu sô nguyên tố");
        int n = scanner.nextInt();
        int count = 0;
        int number =0;
        while (count <= n) {
            boolean flat = true;
            if(number < 2) {
                flat = false;
            } else  {
                for (int i = 2; i <number ; i++) {
                    if(number % i == 0) {
                        flat = false;
                        break;
                    }
                }
            }
            if(flat) {
                System.out.println(number);
                number++;
                count++;
            } else {
                number++;
            }

        }
    }
}
