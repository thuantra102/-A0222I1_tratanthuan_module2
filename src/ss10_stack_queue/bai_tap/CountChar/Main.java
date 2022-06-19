package ss10_stack_queue.bai_tap.CountChar;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        String stTest= "I love You ";
        TreeMap<Character, Integer> treeMap= new TreeMap<>();
        Arrays.asList(stTest.toUpperCase().split("")).forEach(e->{
            int count=1;
            if(treeMap.containsKey(e.charAt(0))){
                count+= treeMap.get(e.charAt(0));
            }
            treeMap.put(e.charAt(0),count);
        });

        for (Map.Entry<Character, Integer> s: treeMap.entrySet()) {
            System.out.println(s);
        }
    }
}
