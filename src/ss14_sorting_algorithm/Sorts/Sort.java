package ss14_sorting_algorithm.Sorts;

import java.util.Arrays;
import java.util.Random;

public class Sort {
    public static void main(String[] args) {
        int[] bubbleArray = randomArray();
        System.out.println("random number before bubble sort");
        display(bubbleArray);
        System.out.println("bubble sort");
        bubbleSort(bubbleArray);
        display(bubbleArray);
     /*
     ----------------------------------------------
      */
        int[] insertionArray = randomArray();
        System.out.println("random number before insertion sort");
        display(insertionArray);
        System.out.println("insertion sort");
        insertionSort(insertionArray);
        display(insertionArray);
    /*
     ----------------------------------------------
      */
        int[] selectionArray = randomArray();
        System.out.println("random number before selection sort");
        display(selectionArray);
        System.out.println("selection sort");
        selectionSort(selectionArray);
        display(selectionArray);


    }
    public static void display(int[] array) {
        System.out.println(Arrays.toString(array));
    }
    public static int[] randomArray() {
        Random random = new Random();
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }
    public static boolean check = true;
    public static void bubbleSort(int[] inputArray) {
        for (int i = 0; i < inputArray.length && check; i++) {
            check = false;
            for (int j = 0; j <inputArray.length-1-i ; j++) {
                if(inputArray[j] > inputArray[j + 1]) {
                    int temp = inputArray[j];
                    inputArray[j] = inputArray[j+1];
                    inputArray[j+1] = temp;
                    check = true;
                }
            }
        }
    }
    public static void insertionSort(int[] inputArray) {
        for (int i = 1; i <inputArray.length ; i++) {
            int currentValue = inputArray[i];
            int check = i -1;
            while (check >=0 && inputArray[check] > currentValue) {
                inputArray[check + 1] = inputArray[check];
                check--;
            }
            inputArray[check + 1] = currentValue;
        }
    }
    public static void selectionSort(int[] inputArray) {
        for (int i = 0; i <inputArray.length ; i++) {
            int currentMinIndex = i;
            int currentMin = inputArray[i];
            for (int j = i+1; j <inputArray.length ; j++) {
                if(currentMin > inputArray[j]) {
                    currentMin = inputArray[j];
                    currentMinIndex = j;
                }
            }
            if(currentMinIndex!= i) {
                inputArray[currentMinIndex] = inputArray[i];
                inputArray[i] = currentMin;
            }
        }
    }
}
