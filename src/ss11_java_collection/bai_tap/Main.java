package ss11_java_collection.bai_tap;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Banh quy", "12344",934);
        Product product2 = new Product("Banh it", "12345",10000);
        Product product3 = new Product("Banh chung", "12346",34);
        ProductList productList = new ProductList();
        productList.addProduct(product1);
        productList.addProduct(product2);
        productList.addProduct(product3);
        productList.fixId("12344");
        productList.deleteId("12344");
        System.out.println(productList.findId("12346"));
        productList.sortAscending();
        productList.sortDescending();
        productList.displayProduct();


    }

}
