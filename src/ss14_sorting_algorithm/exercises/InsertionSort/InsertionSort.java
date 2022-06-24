package ss14_sorting_algorithm.exercises.InsertionSort;

import java.awt.*;
import java.util.Arrays;
import java.util.Random;

public class InsertionSort {
    public static void main(String[] args) {
        Random random = new Random();
        int[] listNumber = new int[10];
        for (int i = 0; i < listNumber.length; i++) {
            listNumber[i] = random.nextInt(100);
        }
        System.out.println("List before insertion sort");
        System.out.println(Arrays.toString(listNumber));
        System.out.println("After");
        int[] list = {5,7,2,3,1,9};
        sort(list);
        System.out.println(Arrays.toString(listNumber));
    }
    public static void sort(int[] inputArray) {
        for (int i = 1; i < inputArray.length; i++) {
            int currentValue = inputArray[i];
            int j = i -1;
            while (j >= 0 && inputArray[j] > currentValue){
                inputArray[j +1]= inputArray[j];
                j--;
            }
            inputArray[j +1] = currentValue;
        }
    }
}
