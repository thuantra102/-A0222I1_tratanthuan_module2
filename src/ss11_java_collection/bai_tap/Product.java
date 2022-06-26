package ss11_java_collection.bai_tap;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import java.util.Comparator;

public class Product  {
    private String name;
    private String id;
    private int price;
    public Product(){};
    public Product(String name, String id,int price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }
   

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", price=" + price +
                '}';
    }
}
