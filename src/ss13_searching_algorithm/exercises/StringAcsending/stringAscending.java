package ss13_searching_algorithm.exercises.StringAcsending;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class stringAscending {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        String string = scanner.nextLine();
        sortString(string);
        sortNomal(string);
    }
    public static void sortString(String string) {
        int[] latinAlphabet = new int[254];
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <latinAlphabet.length ; i++) {
            latinAlphabet[i] =0;
        }
        // thêm value của char vào array
        int length = string.length();
        for (int i = 0; i < length; i++) {
            int value = (int) string.charAt(i);
            latinAlphabet[value]++;
        }
        // có thể làm thêm một vòng lặp nếu muốn in ra các ký tự bị lặp trong chuỗi
//        for (int i = 0; i < latinAlphabet.length-1; i++) {
//            if(latinAlphabet[i] >0) {
//                result.append((char) i);
//            }
//        }
        for (int i = 0; i <length ; i++) {

        }
        System.out.println(result.toString());
    }
    public static void sortNomal(String string){
        char[] chars = string.toCharArray();
        Arrays.sort(chars);
        System.out.println(chars);
    }

}
