package ss10_stack_queue.bai_tap.Palindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> queue = new LinkedList<>();
        Stack<String> stack = new Stack<>();
        System.out.println("Nhập chuổi bạn muốn kiểm tra Palindrome");
        String[] strings = scanner.nextLine().split("");
        for (int i = 0; i <strings.length ; i++) {
            stack.push(strings[i]);
            queue.add(strings[i]);
        }
        boolean check = true;
        while (!stack.isEmpty()) {
            if(!stack.pop().equalsIgnoreCase(queue.remove())) {
                check = false;
                break;
            }
        }

        System.out.println(check);
    }
}
