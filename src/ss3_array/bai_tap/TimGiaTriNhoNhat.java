package ss3_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class TimGiaTriNhoNhat {
    public static void display(int arr[]) {
        System.out.print("Mảng là ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap size cho mang");
        int size = scanner.nextInt();
        int array[] =new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhap gia tri tai index " + i + " bang ");
            array[i] = scanner.nextInt();
        }
        display(array);
        int min = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if(array[i]< min){
                min = array[i];
                index = i;
            }
        }
        System.out.printf("va co gia tri nho nhat la %s tai index la %s ", min,index);
    }
}
