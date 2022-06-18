package ss10_stack_queue.bai_tap.ReverseStack;

import java.util.Scanner;
import java.util.Stack;

public class DaoNguocChuoi {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        String string = "GirlFriend My Is That";
        System.out.println("The String Before Reverse: " + string);
        String[] array = string.split(" ");
        for (int i = 0; i <array.length ; i++) {
            stack.push(array[i]);
        }
        StringBuilder strReseve= new StringBuilder();
        System.out.print("The String After Reverse: " );
        while (!stack.isEmpty()) {
            strReseve.append(stack.pop() + " ");
        }
        System.out.print(strReseve);

    }
}
