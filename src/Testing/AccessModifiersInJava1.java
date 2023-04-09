package Testing;

/*
            Class       Package     SubClass    World
Public      Yes         Yes         Yes         Yes
Protected   Yes         Yes         Yes         No
Default     Yes         Yes         No          No
Private     Yes         No          No          No
 */

public class AccessModifiersInJava1 {

    public static void main(String[] args) {

        AccessModifiersInJava obj = new AccessModifiersInJava();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
        //System.out.println(obj.d);//Cannot access the Private variable in same package

    }
}
