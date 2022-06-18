package ss10_stack_queue.bai_tap.Queue;

import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {

        Queue<String> queue = new Queue();


        queue.enQueue("Node1");
        queue.enQueue("Node2");
        queue.enQueue("Node3");
        queue.enQueue("Node4");
        queue.enQueue("Node5");
        queue.enQueue("Node6");
        queue.deQueue();
        queue.deQueue();
        System.out.println(queue.deQueueOut());






    }
}
