package ss13_searching_algorithm.practice.BinarySearch;

public class Binary {
    public static int binarySearch(int[] list, int target){
        int left =0;
        int right = list.length -1;
        while (left <= right) {
            int middle = (left + right)/2;
            if(target < list[middle]) {
                right = middle -1;
            } else if(target > list[middle]) {
                left = middle + 1;
            } else  {
                return middle;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] list = {1,5,7,9,10,25,27,29,30};
        System.out.println(binarySearch(list,9));
        System.out.println(binarySearch(list,29));
        System.out.println(binarySearch(list,30));
        System.out.println(binarySearch(list,31));
    }
}
