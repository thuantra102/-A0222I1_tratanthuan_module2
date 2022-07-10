package case_study.controllers;

import java.util.Scanner;

public class FuramaController {
    public static Scanner scanner =  new Scanner(System.in);
    public static void main(String[] args) {



    }
    public static void displayMenu() {
        System.out.print("\n 1.Employee Management");
        System.out.print("\n 2.Customer Management ");
        System.out.print("\n 3.Facility Management  ");
        System.out.print("\n 4.Booking Management ");
        System.out.print("\n 5.Promotion Management ");
        System.out.println("\n 6.Exit");
        boolean quite = false;
        int choice =0;
        while (!quite){
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    employeeManagement();

                    break;
                case 2:
                    customerManagement();
                    break;
                case 3: facilityManagement(); break;
                case 4: bookingManagement(); break;
                case 5: promotionManagement(); break;
                case 6: quite = true; break;

            }
        }

    }
    public static void employeeManagement() {
        System.out.print("\n 1 Display list employees");
        System.out.print("\n 2 Add new employee ");
        System.out.print("\n 3 Edit employee  ");
        System.out.print("\n 4 Return main menu ");
    }
    public static void customerManagement() {
        System.out.print("\n 1 Display list customer");
        System.out.print("\n 2 Add new customer ");
        System.out.print("\n 3 Edit customer  ");
        System.out.print("\n 4 Return main menu ");
    }
    public static void facilityManagement() {
        System.out.print("\n 1 Display list facility");
        System.out.print("\n 2 Add new facility ");
        System.out.print("\n 3 Display list facility maintenance  ");
        System.out.print("\n 4 Return main menu ");
    }
    public static void bookingManagement() {
        System.out.print("1.\tAdd new booking\n" +
                "2.\tDisplay list booking\n" +
                "3.\tCreate new constracts\n" +
                "4.\tDisplay list contracts\n" +
                "5.\tEdit contracts\n" +
                "6.\tReturn main menu\n");

    }
    public static void promotionManagement() {
        System.out.print("\n 1.\tDisplay list customers use service\n" +
                "2.\tDisplay list customers get voucher\n" +
                "3.\tReturn main menu\n");

    }
}


