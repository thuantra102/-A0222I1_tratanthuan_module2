package Stream;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.vidu1();
    }
    // sum of array
    public void vidu1() {
        int arr[] = new int[] {1,2,3,4,5,6,76,8};
        int s= Arrays.stream(arr).sum();
        System.out.println("tổng " + s);
        Arrays.stream(arr).forEach((e)-> {
            System.out.println(e);
        });

    }
}
