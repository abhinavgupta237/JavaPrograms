package collectionsdemo;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();

        //Adding elements add() and offer()
        pq.add("A");
        pq.add("B");
        pq.add("C");
        pq.offer("C");

        System.out.println(pq); //[A, B, C, C] > Insertion order preserved and duplicated allowed.

        //Get head element using element() and peek()
        System.out.println(pq.element()); //Returns head element, if empty return NoSuchElementException
        System.out.println(pq.peek()); //Returns head element, if empty return Null

        //Return and remove element from queue using remove() and poll()
        System.out.println(pq.remove()); //Returns [B,C,C], if empty return NoSuchElementException
        System.out.println(pq.poll()); //Returns [C,C], if empty return Null

        LinkedList ll = new LinkedList(); //Heterogeneous data can be stored using LinkedList
        ll.add("A");
        ll.add(1);
        ll.add(2.5);
        ll.offer("This is a line");
        //All the 6 methods we can use for LinkedList also

    }
}
