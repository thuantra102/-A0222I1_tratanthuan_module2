package ss1_java_introduction.thuc_hanh;

import java.util.Scanner;

public class ChiSoCanNang {
    public static void main(String[] args) {
        double weight, height, bmi;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập cân nặng của bạn");
        weight = scanner.nextDouble();
        System.out.println("Nhập chiều cao của bạn");
        height = scanner.nextDouble();
        bmi = weight / Math.pow(height, 2);
        System.out.println(bmi);
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");
        if(bmi< 18) {
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        } else if (bmi < 25.0) {
            System.out.printf("%-20.2f%s", bmi, "Normal");
        } else  if( bmi < 30.0) {
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        } else  {
            System.out.printf("%-20.2f%s", bmi, "Obese");
        }
    }
}
