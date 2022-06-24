package ss11_java_collection.bai_tap.ArrayList;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("thuan");
        list.add("tra");
        list.add("tan");
        list.forEach( n -> System.out.println(n));
    }
}
