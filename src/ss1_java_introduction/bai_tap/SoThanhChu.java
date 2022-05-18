package ss1_java_introduction.bai_tap;

import com.sun.deploy.panel.DeleteFilesDialog;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class SoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhấp số bạn muốn đọc");
        int number = scanner.nextInt();
        if (number < 10) {
            System.out.println(donVi(number));
        } else if (number < 20) {
            System.out.println(tuMuoiDenHaiMuoi(number));
        } else if(number < 100) {
            System.out.println(docHaiSo(number));
        } else if(number < 1000) {
            int hangTram = number / 100;
            int hangchuc = number % 100;
            if(hangchuc == 00) {
                System.out.println(donVi(hangTram) + " Hundred");
            } else {
                System.out.println(donVi(hangTram) + " Hundred and " + docHaiSo(hangchuc));
            }
        }
    }
    public static String donVi(int number) {
        switch (number) {
            case 0: return "zero";
            case 1: return "One";
            case 2: return "Two";
            case 3: return "Three";
            case 4: return "Four";
            case 5: return "Five";
            case 6: return "Six";
            case 7: return "Seven";
            case 8: return "Eight";
            case 9: return "Nine";
            default: return " ";
        }
    }

    public static String tuMuoiDenHaiMuoi(int number) {
        switch (number) {
            case 10: return "Ten";
            case 11: return "Eleven";
            case 12: return "Twelve";
            case 13: return "Thirteen";
            case 14: return "FourTeen";
            case 15: return "FifTeen";
            case 16: return "SixTeen";
            case 17: return "SevenTeen";
            case 18: return "EightTeen";
            case 19: return "NineTeen";
            default: return "Not Found";
        }
    }

    public static String hangChuc(int number) {
        switch (number) {
            case 2: return "Twenty";
            case 3: return "Thirty";
            case 4: return "FourTy";
            case 5: return "FifTy";
            case 6: return "SixTy";
            case 7: return "SevenTy";
            case 8: return "EightTy";
            case 9: return "NineTy";
            default: return "Not Found";
        }
    }
    public static  String docHaiSo(int number) {
        int hangChuc = number / 10;
        int donVi = number % 10;
        if(donVi == 0) {
            donVi = -1;
        }
        return hangChuc(hangChuc) + " " + donVi(donVi);
    }
}
