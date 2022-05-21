package ss3_array.bai_tap;

public class GopMang {
    public static void display(int arr[]) {
        System.out.print("Mảng là ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }
    }

    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {6,7,8,9,10,11};
        int arr3[] = new int[arr1.length + arr2.length];
        int count=0;
        for (int i = 0; i <arr1.length ; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = arr1.length; i <arr3.length ; i++) {
            arr3[i] = arr2[count++];
        }
        display(arr3);
    }
}
