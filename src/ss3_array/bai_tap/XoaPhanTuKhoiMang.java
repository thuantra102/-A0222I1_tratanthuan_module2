package ss3_array.bai_tap;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = {10, 4, 2, 5, 3, 7, 8,0};
        System.out.println("Nhap gia tri ban muon tim");
        int index = scanner.nextInt();
        int check = findIndex(arr, index);
        if(check!= -1) {
            for (int i = check; i < arr.length -1 ; i++) {
                arr[i] = arr[i+1];
            }
        } else {
            System.out.println("Không tìm thấy phần tử trong mảng");
        }
        System.out.print("Mảng là ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }


    }

    public static int findIndex(int array[], int findIndex) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (findIndex == array[i]) {
                index = i;
            }
        }
        return index;
    }

}
