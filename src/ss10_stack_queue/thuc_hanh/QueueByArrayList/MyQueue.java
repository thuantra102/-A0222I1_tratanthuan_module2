package ss10_stack_queue.thuc_hanh.QueueByArrayList;

public class MyQueue {
    private int capacity;
    private int queueArr[];
    private int head = 0;
    private int tail = -1;
    private int currentSize = 0;

    public MyQueue(int queueSize) {
        this.capacity = queueSize;
        queueArr = new int[this.capacity];
    }
    public boolean isQueueFull() {
        if(currentSize == capacity) {
            return true;
        }
        return false;
    }
    public boolean isQueueEmpty() {
        if(currentSize == 0) {
            return true;
        }
        return false;
    }
    public void euQueue(int item) {
        if(isQueueFull()) {
            System.out.println("Day roi khong them vao duoc nua");
        }
        tail++;
        if (tail == capacity - 1) {
            tail = 0;
        }
        queueArr[tail] = item;
        currentSize++;
        System.out.println("Push " + item + " to queue");
    }
    public void dequeue() {
        if (isQueueEmpty()) {
            System.out.println("Underflow ! Unable to remove element from Queue");
        } else {
            head++;
            if (head == capacity - 1) {
                System.out.println("Pop operation done ! removed: " + queueArr[head - 1]);
                head = 0;
            } else {
                System.out.println("Pop operation done ! removed: " + queueArr[head - 1]);
            }
            currentSize--;
        }
    }
    public void printQueue() {
        for (int i = 0; i <queueArr.length ; i++) {
            System.out.print(queueArr[i] + " ");
        }
    }
}
