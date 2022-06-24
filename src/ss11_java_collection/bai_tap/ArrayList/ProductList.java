package ss11_java_collection.bai_tap.ArrayList;

import org.omg.CORBA.CODESET_INCOMPATIBLE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ProductList  {

    Scanner scanner = new Scanner(System.in);
    public ArrayList<Product> productList ;


    public ProductList() {
        this.productList = new ArrayList<>();
    }

    public void addProduct(Product newProduct) {
        int lastIndex = this.productList.size()-1;
        if(this.productList.size()==0) {
            newProduct.setId(1);
        } else {
            int lastId = this.productList.get(lastIndex).getId();
            newProduct.setId(lastId+1);
        }

        productList.add(newProduct);

    }
    public void modifyProductById(int id) {
        int index = findId(id);
        if(index >= 0) {
            System.out.println("Please Enter The New Name For This Product");
            String name = scanner.nextLine();
            this.productList.get(index).setName(name);
        } else  {
            System.out.println("Id Is Incorrect");
        }
    }

    public void removeProductById(int id) {
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
    public int findId(int id) {
        for (int i = 0; i <this.productList.size() ; i++) {
            Product pr = this.productList.get(i);
            if(pr.getId() == id ){
                return i;
            }
        }
        return -1;
    }
    public void sortAscending() {
//        Collections.sort(this.productList, new ComparePrice());
        this.productList.sort((o1, o2)-> {return o1.getPrice()-o2.getPrice();});

    }

    public void sortDescending() {
//        sortAscending();
//        Collections.reverse(this.productList);
        Collections.sort(this.productList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o2.getPrice()- o1.getPrice();
            }
        });




    }
    public void displayProduct() {
//        for (int i = 0; i < this.productList.size() ; i++) {
//            System.out.println(this.productList.get(i).toString());
//        }
        this.productList.forEach((product) -> {System.out.println(product.toString());});
    }


}
