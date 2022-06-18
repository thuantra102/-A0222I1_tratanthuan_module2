package ss10_stack_queue.bai_tap.Queue;

import jdk.internal.org.objectweb.asm.util.CheckAnnotationAdapter;
import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import java.util.DoubleSummaryStatistics;
import java.util.Iterator;

public class Queue<T> {
    private Node<T> front, rear;
    public void enQueue(T data) {
        Node<T> temp = new Node(data);
        if(front == null) {
            front = temp;
        } else {
            rear.next = temp;
        }
        rear = temp;
        rear.next = front;
    }

    public String deQueueOut() {
        Node<T> temp = new Node();
        temp = front;
        if(front != null) {
            if (front.equals(rear)) {
                front = null;
                rear = null;
            } else {
                temp = front;
                front = front.next;
                rear.next = front;
            }
        }
        return (String) temp.data;
    }
    // Khong the over loading vi no khong co cung ten method
    public void deQueue() {
        if (front != null) {
            if (front.equals(rear)) {
                front = null;
                rear = null;
            } else {
                front = front.next;
                rear.next = front;
            }
        }
    }
    public boolean contain(T data) {
        if(front == null) {
            return false;
        }
        Node<T> temp = front;
        do {
            if(data.equals(temp.data)) {
                return true;
            }
                temp = temp.next;

        }while (temp != front);

        return false;

    }

    public void printQueue() {
        if(front != null) {
            Node<T> temp = front;
            do {
                System.out.println(temp.data);
                System.out.println(temp);
                temp  = temp.next;
            }while (temp != front );
            // test xem thèn tail có trỏ đỉa chỉ tham chiếu tới trung với thèn đầu hay không?
            System.out.println("Address of tail");
            System.out.println(temp);


        } else {
            System.out.println("Khong co phan tu nao ca");
        }
    }



}
