package collectionsdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListDemo2 {

    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("F");
        al.add("B");
        al.add("C");
        al.add("D");
        al.add("E");
        al.add("A");
        System.out.println(al);

        ArrayList al1 = new ArrayList();
        al1.addAll(al);
        System.out.println(al1);
        al1.removeAll(al);////////////////////////////
        System.out.println("After deletion " + al1);
        Collections.sort(al);
        System.out.println(al);
        //Print elements of ArrayList in reverse order
        Collections.sort(al,Collections.reverseOrder());//////////////////////////
        System.out.println(al);

        //Shuffle the elements present in the ArrayList
        Collections.shuffle(al);////////////////////
        System.out.println(al);

        //Convert Array into ArrayList
        //String arrr[] = {"A", "B", "C", "X", "Y", "Z"};
        int arrr[] = {1,2,3,4,5,6};
        /*Converting Integer Array to Integer ArrayList is not possible directly. We have to use Stream API for this.*/
       //ArrayList <Integer> all = new ArrayList(Arrays.asList(arrr)); NOT Possible
        //List<Integer> list = Arrays.stream(ints).boxed().toList(); This is possible

        //System.out.println(all);


    }
}
