package Baitap.Controler;

import Baitap.Model.Phone.Genuine;
import Baitap.Model.Phone.Handed;
import Baitap.Model.Phone.Phone;
import Baitap.Model.Phone.Status;
import Baitap.View.PhoneManage;
import Baitap.Util.NotFoundException;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static PhoneManage phoneManage = new PhoneManage();
    public static void main(String[] args) throws NotFoundException, Exception {

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
                    printPhone();
                    break;
                case 2: addPhone(); break;
                case 3: delete(); break;
                case 4: search(); break;
                case 5: phoneManage.writeFile(); break;
                case 6: quite= true; break;
            }
        }

    }
    public static  void printInstruction() {
        System.out.print("\nPress " +
                "\n 0 - Print choice options." +
                "\n 1 - Print the list of product" +
                "\n 2 - Add a new product to the list" +
                "\n 3 - Delete the product in the list "  +
                "\n 4- Search a product from the list " +
                "\n 5- Update a product  from the list " +
                        "\n 6- Quite the application \n");

    }
    public static void delete()  {
//      boolean isExists;
//        do {
//            System.out.println("Nhap id");
//            int id = Integer.parseInt(scanner.nextLine());
//            try {
//                phoneManage.deleteById(id);
//                isExists = false;
//            }
//            catch (NotFoundException e){
//                System.out.println(e.getMessage());
//                isExists = true;
//            }
//        } while (isExists);
        while (true) {
            System.out.println("Enter id");
            int idPhone = Integer.parseInt(scanner.nextLine());
            try {
                phoneManage.deleteById(idPhone);
                break;
            }catch (NotFoundException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void printPhone() {phoneManage.display();}
    public static void addPhone() {
        System.out.println("You want to add genuine or secondhand ");
        String userChoice = scanner.nextLine();
        if(userChoice.equalsIgnoreCase("genuine")) {
            System.out.println("Enter the name of this phone");
            String name = scanner.nextLine();
            System.out.println("Enter price");
            float price = Float.parseFloat(scanner.nextLine());
            System.out.println("Enter the name of produce");
            String produce = scanner.nextLine();
            System.out.println("Enter time ");
            String time = scanner.nextLine();
            System.out.println("Enter code of genuine");
            int code = Integer.parseInt(scanner.nextLine());
            phoneManage.addPhone(new Genuine(name,price,produce,time,code));
        } else {
            System.out.println("Enter the name of this phone");
            String name = scanner.nextLine();
            System.out.println("Enter price");
            float price = Float.parseFloat(scanner.nextLine());
            System.out.println("Enter the name of produce");
            String produce = scanner.nextLine();
            System.out.println("Enter country");
            String country = scanner.nextLine();
            System.out.println("Enter status");
            String status = scanner.nextLine();
            Status statusPhone ;
            if(status.equalsIgnoreCase("old")) {
                statusPhone = Status.OLD;
            } else {
                statusPhone = Status.NEW;
            }
            phoneManage.addPhone(new Handed(name,price,produce,country,statusPhone));
        };

    }
    public static void search() {
        System.out.println("Enter the name of this phone");
        String name = scanner.nextLine();
        if (phoneManage.searchByname(name) != null) {
            System.out.println(phoneManage.searchByname(name).toString());
        } else {
            System.out.println("Name is not exists");
        }
    }
    public static void update(){
        System.out.println("Enter id");
        int id = Integer.parseInt(scanner.nextLine());
        int updatePhone = phoneManage.updatePhoneById(id);
        if (updatePhone != -1) {

        }
    }
    public static void writeToFile() {
        phoneManage.writeFile();
    }
}
