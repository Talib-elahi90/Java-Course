import java.util.LinkedList;
import java.util.ListIterator;

public class UseLinkedList {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(4);
        linkedList.add(8);
        linkedList.add(1, 9); // Add element at a particular index
        linkedList.addFirst(2);
        linkedList.addLast(10);
        ListIterator<Integer> linListIterator = linkedList.listIterator();
        while (linListIterator.hasNext()) {
            System.out.println(linListIterator.next());
        }

        System.out.println();
        while (linListIterator.hasPrevious()) {
            System.out.println(linListIterator.previous());
        }

    }

}
