package ss13_searching_algorithm.exercises.BinaryWithRecursive;

public class BinaryWithRecursive {
    public static void main(String[] args) {
        int[] array = {2,3,4,5,6,7,8};
        System.out.println(search(array, 0, array.length - 1, 8));

    }

    public static int search(int arr[], int left, int right, int target) {
        if (right >= left) {
            int mid = left +  (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                return search(arr, mid + 1, right, target);
            } else {
                return search(arr,left,mid-1, target);
            }

        }
        return -1;
    }
}
