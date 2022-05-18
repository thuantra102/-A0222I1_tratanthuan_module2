package ss2_array_loop.bai_tap;

public class MotTramSoNguyenTo {
    public static void main(String[] args) {
        for (int i = 2; i <100 ; i++) {
            boolean check = isPrime(i);
            if(check) {
                System.out.println(i);
            }
        }
    }


    public static  boolean isPrime(int number) {
        if(number < 2) {
            return  false;
        } else  {
            for (int i = 2; i < number; i++) {
                if(number % i == 0) {
                    return  false;
                }
            }
        }
        return  true;
    }
}
