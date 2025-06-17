// Queue uses firse-in-first-out operations. we use with LinkedList.

import java.util.LinkedList;
import java.util.Queue;

public class UseQueues {
    public static void main(String[] args) {
        Queue<Detail> queue = new LinkedList<>();
        queue.add(new Detail("Ali", 22));
        queue.add(new Detail("Mari", 19));
        queue.add(new Detail("Zahid", 24));
        System.out.println("1st row " +queue.peek());
        System.out.println("Remove 1st Row " +queue.poll());
        System.out.println("After removing " +queue.peek());
        System.out.println("element " +queue.element());
    }

    static record Detail(String name, int age) { }
}
