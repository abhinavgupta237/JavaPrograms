package collectionsdemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        //Ways to declare Arraylist
        ArrayList al = new ArrayList();
        //List al1 = new ArrayList();
        //ArrayList <Integer>al2 = new ArrayList();
        //ArrayList <String>al3 = new ArrayList();

        //Add new elements to Arraylist
        al.add(100);
        al.add("Welcome");
        al.add(15.5);
        al.add('A');
        al.add(true);

//        System.out.println(al);
//        System.out.println(al.size());
//        al.remove(1);
//        System.out.println(al);

//        al.add(1,10);
//        System.out.println(al.get(2));
//        al.set(2,"Hello");
//        System.out.println(al.get(2));
//        System.out.println(al.get(2));
//        System.out.println(al.contains('A'));
        //Using iterator method to print the ArrayList
//        Iterator it = al.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//
//        }

            Iterator it = al.iterator();
            while (it.hasNext()){
                System.out.println(it.next());
            }
    }
}
