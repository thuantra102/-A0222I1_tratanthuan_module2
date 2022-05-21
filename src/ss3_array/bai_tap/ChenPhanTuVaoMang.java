package ss3_array.bai_tap;

import java.util.Scanner;

public class ChenPhanTuVaoMang {
    public static void display(int arr[]) {
        System.out.print("Mảng là ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,6};
        int arrNew[] = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            arrNew[i] = arr[i];
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá trị bạn muốn chèn");
        int value = scanner.nextInt();
        System.out.println("Nhập giá trị index bạn muốn chèn tại mảng");
        int index = scanner.nextInt();
        if(index <= 1 || index >= arr.length-1) {
            System.out.println("Không chèn vào được");
        } else  {
        for (int i = arrNew.length-1; i  > index ; i--) {
                arrNew[i] = arrNew[i-1];
            }
        arrNew[index] = value;
        display(arrNew);
        }

    }
}
