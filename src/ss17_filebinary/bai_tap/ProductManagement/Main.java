package ss17_filebinary.bai_tap.ProductManagement;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
       ProductManagement productManagement = new ProductManagement();
       productManagement.addProduct(new Product("samsung12", "ss",4,"expensive phone"));
       productManagement.addProduct(new Product("samsung13", "ss",4,"expensive phone"));
       productManagement.addProduct(new Product("samsung15", "ss",4,"expensive phone"));
       productManagement.addProduct(new Product("samsung17", "ss",4,"expensive phone"));
//       productManagement.displayList();
       productManagement.searchByName("samsung12");
//       productManagement.readDataFromFile().forEach(System.out::println);

    }
}
