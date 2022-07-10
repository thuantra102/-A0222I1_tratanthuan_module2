package ss15_exeption_and_debug.practice.ArrayIndexOutOfBoundsException;

import java.util.Random;
import java.util.Scanner;

public class ArrayIndexOutOfBoundsException {

    public static void main(String[] args) {
        ArrayExample arrExample = new ArrayExample();
        Integer[] arr = arrExample.createRandom();

        Scanner scaner = new Scanner(System.in);
        System.out.println("\nVui lòng nhập chỉ số của một phần tử bất kỳ: ");
        int x = scaner.nextInt();
        try {
            System.out.println("Giá trị của phần tử có chỉ số " + x + " là " + arr[x]);
        } catch (Exception e) {
            System.err.println("Chỉ số vượt quá giới hạn của mảng");
        } finally {
            System.out.println("anh yeu em");
        }
    }
}
