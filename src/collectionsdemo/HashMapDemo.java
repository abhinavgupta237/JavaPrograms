package collectionsdemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        //HashMap m = new HashMap();
        HashMap <Integer,String> m = new HashMap<Integer,String>();
        m.put(101,"John");
        m.put(102,"David");
        m.put(103,"Scott");
        m.put(104,"Mary");
        m.put(105,"Tye");
        m.put(103,"X");
        m.put(106,"David");
        //System.out.println(m);//{101=John, 102=David, 103=Scott, 104=Mary, 105=Tye}
        //System.out.println(m);//{101=John, 102=David, 103=X, 104=Mary, 105=Tye, 106=David}
        System.out.println(m.get(105));//Tye
        m.remove(106);
        System.out.println(m);
        System.out.println(m.containsKey(105)); //true
        System.out.println(m.containsKey(106)); //false
        System.out.println(m.containsValue("David"));//true
        System.out.println(m.isEmpty());//false
        System.out.println(m.keySet());//returns all keys
        System.out.println(m.values());//returns all values
        System.out.println(m.entrySet());//return all entries
/*
        for (Object i:m.keySet()) {
            System.out.println(i);
        }
        for (Object i:m.values()) {
            System.out.println(i);
        }
        for (Object i:m.entrySet()) {
            System.out.println(i);
        }
        //Printing through Hashmap methods
        for (Object i:m.keySet()) {
            System.out.println(i+"  "+m.get(i));//////////////////////////////////////////
        }
        //Printing through Entry methods
        for (Map.Entry entry:m.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());//////////////////////////////////////////
        }
  */      //Printing through iterator() method
        Set s = m.entrySet();
        Iterator itr = s.iterator();
        while (itr.hasNext()){
            Map.Entry entry = (Map.Entry) itr.next();
            System.out.println(entry.getKey()+ "  " + entry.getValue());

        }




    }
}