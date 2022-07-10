package ss15_exeption_and_debug.exercises.Test;

import java.util.Scanner;

public class Test {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws MyException {
        int[] num = new  int[5];
        System.out.println("Nhap so ban muon them vao mang{lua y so phai nho hon length}");
        int value = scanner.nextInt();
        if(value > num.length){
            throw new MyException("Số của value của bạn đã lớn hơn 5");
        }
    }

}
