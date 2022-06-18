package ss10_stack_queue.thuc_hanh.QueueByArrayList;

public class Main {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(5);
        queue.euQueue(6);
        queue.euQueue(6);
        queue.euQueue(6);
        queue.euQueue(6);
        queue.euQueue(6);
        queue.euQueue(6);
        queue.dequeue();
        queue.dequeue();
        queue.printQueue();

    }
}

