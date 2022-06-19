package ss11_java_collection.bai_tap.ArrayList;

import java.util.Comparator;

public class ComparePrice implements Comparator<Product> {
    public ComparePrice() {
    }

    @Override
    public int compare(Product o1, Product o2) {
        if(o1.getPrice() > o2.getPrice()){
            return 1;
        }else if(o1.getPrice() == o2.getPrice()){
            return 0;
        }else{
            return -1;
        }
    }

}
