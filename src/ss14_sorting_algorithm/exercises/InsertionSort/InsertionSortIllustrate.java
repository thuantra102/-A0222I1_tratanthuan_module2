package ss14_sorting_algorithm.exercises.InsertionSort;

import java.util.Arrays;

public class InsertionSortIllustrate {
    public static void main(String[] args) {
        int[] list = {4,2,5,1,7,8};
        System.out.println("List after sort");
        display(list);
        sort(list);
        System.out.println("List before sort");
        display(list);
    }
    public static void sort(int[] inputArray) {
        for (int i = 1; i < inputArray.length; i++) {
            int temp = inputArray[i];
            int j = i -1;
            while (j >= 0 && inputArray[j] > temp) {
                inputArray[j+1]= inputArray[j];
                j--;
            }
            inputArray[j+ 1] = temp;
            System.out.println("List number in " + i + " times");
            display(inputArray);
        }
    }
    public static void display(int[] inputArray) {
        System.out.println(Arrays.toString(inputArray));
    }
}
