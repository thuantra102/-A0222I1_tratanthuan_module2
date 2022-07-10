package ss18_validate.practice.test1;

public class Regex {
    public static void main(String[] args) {
        String emailPattern = "^\\w+@[a-z]{2,5}\\.[a-z]{3}$";
        String myEmail = "Thuantra102@gmail.com";
        boolean check = myEmail.matches(emailPattern);
        System.out.println(check);
    }
}
