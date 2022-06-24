package ss13_searching_algorithm.exercises.StringAcsending;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringAscendingOder {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        String string = scanner.nextLine();
        List<Integer> array = changeToValue(string);
        sortArray(array);
    }
    public static List<Integer> changeToValue(String string) {
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            int value = (int) string.charAt(i);
            array.add(value);
        }
        return array;
    }
    public static void sortArray(List<Integer> array) {
        List<Integer> listSorted = new ArrayList<>();
        listSorted.add(array.get(0));
        for (int i =0; i < array.size()-1 ; i++) {
            if(listSorted.get(listSorted.size()-1) < array.get(i+1)) {
                listSorted.add(array.get(i+1));
            }
        }
        listSorted.forEach((p)-> {
            System.out.print(Character.toChars(p));
        });
    }
}
