package ss11_java_collection.bai_tap;

import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    private static ProductList productList = new ProductList();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean quite = false;
        int choice = 0;
        printInstruction();
        while (!quite)  {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

            scanner.nextLine();
            switch (choice) {
                case 0:
                    printInstruction();
                    break;
                case 1:
                    printProduct();
                    break;
                case 2: addProduct(); break;
                case 3: modifyProduct(); break;
                case 4: removeProduct(); break;
                case 5: searchProduct(); break;
                case 6:sortAscending(); break;
                case 7:sortDescending(); break;
                case 8: quite= true; break;
                default:defaultOption();break;
            }
        }

    }
    public static  void printInstruction() {
        System.out.print("\nPress ");
        System.out.print("\n 0 - Print choice options.");
        System.out.print("\n 1 - Print the list of product ");
        System.out.print("\n 2 - Add a new product to the list ");
        System.out.print("\n 3 - Modify the product in the list ");
        System.out.print("\n 4- Remove a product from the list ");
        System.out.print("\n 5- Search a product  from the list ");
        System.out.print("\n 6- Sort the list in ascending order  ");
        System.out.print("\n 7- Sort the list in descending order ");
        System.out.println("\n 8- Quite the application ");
    }
    public static void defaultOption() {
        System.out.println("The Number Of Choice Is Incorrect, Please Enter Again Your Choice");
    }
    public static void printProduct() {
        productList.displayProduct();
    }
    public static void addProduct() {
        System.out.println("Please Enter The Name Of The Product");
        String name = scanner.nextLine();
        System.out.println("Please Enter The Id Of The Product");
        String id = scanner.nextLine();
        System.out.println("Please Enter The Price Of The Product");
        int price = scanner.nextInt();
        productList.addProduct(new Product(name,id,price));
        System.out.println("The Your Product Is Added To The List");
    }
    public static  void modifyProduct() {
        System.out.println("Please Enter If Of Product That You Want To Modify");
        String id = scanner.nextLine();
        productList.modifyProductById(id);
    }
    public static void removeProduct() {
        System.out.println("Please Enter If Of Product That You Want To Remove ");
        String id = scanner.nextLine();
        productList.removeProductById(id);
    }
    public static void searchProduct() {
        System.out.println("Please Enter Name Of The Product That You Want To Search");
        String name = scanner.nextLine();
        productList.findProduct(name);

    }
    public static void sortAscending() {
        productList.sortAscending();
        System.out.println("The list Is Sorted In Ascending Order");
    }
    public static void sortDescending() {
        productList.sortDescending();
        System.out.println("The list Is Sorted In Descending Order");
    }



}


