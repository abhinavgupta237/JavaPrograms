package collectionsdemo;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {
    public static void main(String[] args) {

        LinkedList l = new LinkedList();
        l.add("A");
        l.add("Abhinav");
        l.add(1.1);
        l.add(100);
        //We can store null in Linked list
        l.add(null);///////////////////////////////////////
        System.out.println(l);

        l.remove(3);
        System.out.println(l);
        System.out.println(l.get(3));
        l.set(3,"Best");
        System.out.println(l.get(3));
        System.out.println(l.contains("Best"));
        System.out.println(l.contains(1.2));
        //isEmpty()
        System.out.println(l.isEmpty());///////////////////////

        for (Object i:l) {
            System.out.println(i);
        }
        //Iterator method
        Iterator it = l.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }



}
