package ss11_java_collection.bai_tap.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductList  {
    Scanner scanner = new Scanner(System.in);
    public ArrayList<Product> productList ;


    public ProductList() {
        this.productList = new ArrayList<>();
    }

    public void addProduct(Product newProduct) {
        if(findId(newProduct.getId())>=0) {
            System.out.println("The Product Is Already In The List");
        } else  {
            productList.add(newProduct);
        }
    }
    public void modifyProductById(String id) {
        int index = findId(id);
        if(index >= 0) {
            System.out.println("Please Enter The New Name For This Product");
            String name = scanner.nextLine();
            this.productList.get(index).setName(name);
        } else  {
            System.out.println("Id Is Incorrect");
        }
    }

    public void removeProductById(String id) {
        int index = findId(id);
        if(index >=0) {
            this.productList.remove(index);

        } else  {
            System.out.println("Id Is Incorrect");
        }

    }

    public String findProduct(String productName) {
        for (int i = 0; i <this.productList.size() ; i++) {
            Product pr = this.productList.get(i);
            if(pr.getName().equals(productName)) {
                return this.productList.get(i).toString();
            }

        }
        return null;
    }
    public int findId(String id) {
        for (int i = 0; i <this.productList.size() ; i++) {
            Product pr = this.productList.get(i);
            if(pr.getId().equals(id)) {
                return i;
            }

        }
        return -1;
    }
    public void sortAscending() {
        Collections.sort(this.productList, new ComparePrice());
    }
    public void sortDescending() {
        sortAscending();
        Collections.reverse(this.productList);
    }
    public void displayProduct() {
        for (int i = 0; i < this.productList.size() ; i++) {
            System.out.println(this.productList.get(i).toString());
        }
    }


}
