package ss10_stack_queue.bai_tap.ReverseStack;


import java.util.Stack;

public class ReverseAStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int[] array = {4,5,6,7,8};
        for (int i = 0; i <array.length ; i++) {
            stack.push(array[i]);
        }
        while (!stack.isEmpty()) {
            System.out.print(+ stack.pop() + " ");
        }
    }




}
