package ss11_java_collection.bai_tap;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;
import ss11_java_collection.thuc_hanh.Compare.Student;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductList  {
    Scanner scanner = new Scanner(System.in);
    public ArrayList<Product> productList ;


    public ProductList() {
        this.productList = new ArrayList<>();
    }

    public void addProduct(Product newProduct) {
        if(findProduct(newProduct.getName())>=0) {
            System.out.println("San pham da duoc khai bao");
        } else  {
            productList.add(newProduct);
        }
    }
    public void fixId(String id) {
        int index = findId(id);
        if(index >= 0) {
            System.out.println("Nhap ten san pham ban muon sua");
            String name = scanner.nextLine();
            this.productList.get(index).setName(name);
        } else  {
            System.out.println("Id bi sai");
        }
    }

    public void deleteId(String id) {
        int index = findId(id);
        if(index >=0) {
            this.productList.remove(index);

        } else  {
            System.out.println("Nhap sai id");
        }

    }

    private int findProduct(String productName) {
        for (int i = 0; i <this.productList.size() ; i++) {
            Product pr = this.productList.get(i);
            if(pr.getName().equals(productName)) {
                return  i;
            }

        }
        return -1;
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
//        Co the dung lop an danh de sai comparator cho nhanh
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
