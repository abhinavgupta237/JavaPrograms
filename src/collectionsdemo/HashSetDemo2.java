package collectionsdemo;

import java.util.HashSet;

public class HashSetDemo2 {
    public static void main(String[] args) {

       /* HashSet hs = new HashSet();
        hs.add(2);
        hs.add(4);
        hs.add(6);
        System.out.println(hs);

        HashSet hs1 = new HashSet();
        hs1.add(hs);
        hs1.add(8);
        System.out.println(hs1);*/

        //Union
        /*HashSet hs = new HashSet();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(5);

        HashSet hs1 = new HashSet();
        hs1.add(3);
        hs1.add(4);
        hs1.add(5);

        hs.addAll(hs1);/////////////////////
        System.out.println(hs);

        //Intersection
        HashSet hs = new HashSet();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(5);

        HashSet hs1 = new HashSet();
        hs1.add(3);
        hs1.add(4);
        hs1.add(5);

        hs.retainAll(hs1);/////////////////////
        System.out.println(hs);

        //Difference
        HashSet hs = new HashSet();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(5);

        HashSet hs1 = new HashSet();
        hs1.add(3);
        hs1.add(4);
        hs1.add(5);

        hs.removeAll(hs1);/////////////////////
        System.out.println(hs);
*/
        //Subset
        HashSet hs = new HashSet();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(5);

        HashSet hs1 = new HashSet();
        hs1.add(3);
        hs1.add(4);
        hs1.add(5);

        System.out.println(hs.containsAll(hs1)) ;/////////////////////



    }
}
