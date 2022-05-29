package ss4_object.bai_tap.QuadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap a ");
        double a = scanner.nextDouble();
        System.out.print("Nhap b ");
        double b = scanner.nextDouble();
        System.out.print("Nhap c ");
        double c = scanner.nextDouble();
        QuadraticEquation phuongTrinhBacHai = new QuadraticEquation(a,b,c);
        double detal = phuongTrinhBacHai.getDiscriminant();
        System.out.println("Phuong trinh cua ban  a = " + phuongTrinhBacHai.getA() + " , b = " + phuongTrinhBacHai.getB() +
                " , c = " + phuongTrinhBacHai.getC() + " va detal = " + detal);
        if(detal > 0) {
            System.out.println("Nghiem 1 = " + phuongTrinhBacHai.getRoot1() + " Nghiem 2  = " + phuongTrinhBacHai.getRoot2());
        } else if(detal < 0){
            System.out.println(phuongTrinhBacHai.displayNoRoot());
        } else  {
            System.out.println("Phuong trinh co mot nghiem la " + phuongTrinhBacHai.getRoot2());
        }



    }
}
