package ss3_array.thuc_hanh;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class DaoNguocPhanTu {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a size");
            size = scanner.nextInt();
            if(size > 4) {
                System.out.println("Size does not exceed 4 ");
            }
        } while (size >4);
        array = new  int[size];
        for (int i = 0; i <array.length ; i++) {
            System.out.println("Nhâp giá index " + i + "bằng");
            array[i] = scanner.nextInt();
        }
        System.out.println("Mảng nhập vào có những sô sau");
        for (int j = 0; j < array.length ; j++) {
            System.out.printf(array[j] + "\t");
        }
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        System.out.printf("\n%-20s%s", "Reverse array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
