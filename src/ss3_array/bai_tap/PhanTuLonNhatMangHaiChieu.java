package ss3_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class PhanTuLonNhatMangHaiChieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số hàng bạn muốn ");
        int row = scanner.nextInt();
        System.out.println("Nhập số cột bạn muốn ");
        int colum  = scanner.nextInt();
        int array[][]  = new int[row][colum];
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array[i].length ; j++) {
                System.out.println("Nhập giá trị tại vị trí index là " + i + "" + j + " là");
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println("args = " + Arrays.deepToString(array));
        System.out.println("tim giá trị lớn nhất trong mảng");
        int max = array[0][0];
        int indexi = 0;
        int indexj = 0;
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                if(array[i][j] > max) {
                    max = array[i][j];
                    indexi = i;
                    indexj = j;
                }
            }

        }
        System.out.println("Gia tri lon nhat cua mang la " + max + " co gia tri index tai " + indexi + " " + indexj);
    }
}
