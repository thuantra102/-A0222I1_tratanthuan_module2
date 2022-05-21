package ss3_array.thuc_hanh;
import java.util.Scanner;
public class GiaTriLonNhat {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhap size");
            size = scanner.nextInt();
            if(size > 5) {
                System.out.println("Size qua lon nho hon 5 thoi");
            }
        } while (size > 5);
        array = new  int[size];
        for (int i = 0; i < array.length ; i++) {
            System.out.printf("Nhap gia tri tai index %d bang", i);
            array[i] = scanner.nextInt();
        }
        System.out.print("Mang la ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        int max = array[0];
        int index =0;
        for (int j = 0; j <array.length ; j++) {
            if(array[j]> max) {
                max = array[j];
                index = j;
            }

        }
        System.out.println("The largest property value in the list is " + max + " ,at position " + index);

    }
}
