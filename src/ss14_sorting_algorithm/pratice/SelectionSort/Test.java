package ss14_sorting_algorithm.pratice.SelectionSort;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] list = {4,5,6,2,1,10};
        sort(list);
        System.out.println(Arrays.toString(list));
    }
    public static void sort(int[] list) {
        for (int i = 0; i < list.length-1; i++) {
            int minList = list[i];
            int minIndex = i;
            for (int j = i +1; j < list.length; j++) {
                if(list[j] < minList) {
                    minList = list[j];
                    minIndex = j;
                }
            }
            if(minIndex != i) {
                list[minIndex] = list[i];
                list[i] = minList;
            }
        }

    }
}
