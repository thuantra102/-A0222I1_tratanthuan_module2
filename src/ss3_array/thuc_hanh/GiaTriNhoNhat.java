package ss3_array.thuc_hanh;

public class GiaTriNhoNhat {
    public static void main(String[] args) {
    int arr[] = {4, 12, 7, 8, 1, 6, 9};
    int index = minValue(arr);
        System.out.printf("Gia tri nho nhat cua mang la %s co gia tri index tai %s", arr[index], index);
    }

    public static  int minValue(int[] array) {
        int index = 0;
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] < min) {
                min = array[i];
                index = i;
            }
        }
        return  index;
    }
}
