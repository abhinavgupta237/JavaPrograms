package collectionsdemo;

import java.util.LinkedList;

public class LinkedListDemo3 {

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        ll.add("First");
        ll.add("Second");
        ll.add("Third");
        ll.add("Fourth");
        ll.addFirst("A");
        ll.addLast("Z");
        System.out.println(ll);
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);


    }
}
