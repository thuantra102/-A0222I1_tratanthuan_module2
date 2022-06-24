package ss14_sorting_algorithm.pratice.BubbleSort;

public class Test {
    public static void main(String[] args) {
        int[] list = {1,2,4,3};
        sort(list);
        for (int p:list) {
            System.out.println(p);
        }
    }
    public static boolean check = true;
    public static void sort(int[] list) {
        for (int i = 0; i < list.length && check; i++) {
            check = false;
            for (int j = 0; j <list.length-i-1 ; j++) {
                if(list[j] > list[j+1]) {
                    int temp = list[j];
                    list[j] = list[j +1];
                    list[j+1] = temp;
                    check= true;
                }
            }
        }

    }
}
