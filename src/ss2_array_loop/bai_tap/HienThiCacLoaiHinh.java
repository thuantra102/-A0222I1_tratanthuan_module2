package ss2_array_loop.bai_tap;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while(choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle bottom left");
            System.out.println("3. Print the square triangle top left");
            System.out.println("4. Print isosceles triangle");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Print the rectangle");
                    for (int i = 0; i <3 ; i++) {
                        System.out.println("* * * * * *");
                    }
                    break;
                case 2:
                    System.out.println("Print the square triangle bottom left");
                    for (int i = 1; i <=5 ; i++) {
                        for (int j = 1; j < i;j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Print  square triangle to left");
                    for (int i = 7; i >1; i--) {
                        for(int j = 1; j < i; j ++) {
                            System.out.printf("*");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("Print isosceles triangle");
                    int k =0;
                    for (int i = 1; i <= 8; ++i, k = 0) {
                        for (int space = 1; space <= 8 - i; ++space) {
                            System.out.print("  ");
                        }
                        while (k != 2 * i - 1) {
                            System.out.print("* ");
                            ++k;
                        }
                        System.out.println();
                    }
                case 5:
                    System.exit(5);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
