package ss10_stack_queue.bai_tap.Queue;

import com.sun.org.apache.xpath.internal.objects.XNodeSet;
import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

public class Node<T> {
    public Node<T> next;
    public T data;
    public Node(T data) {
        this.data = data;

    }

    public Node() {
    }
}
