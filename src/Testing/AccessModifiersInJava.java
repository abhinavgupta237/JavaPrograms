package Testing;

/*
            Class       Package     SubClass    World
Public      Yes         Yes         Yes         Yes
Protected   Yes         Yes         Yes         No
Default     Yes         Yes         No          No
Private     Yes         No          No          No
 */

public class AccessModifiersInJava {
    public int a = 10;
    protected int b = 20;
    int c = 30;
    private int d = 40;
    public static void main(String[] args) {

        AccessModifiersInJava obj = new AccessModifiersInJava();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
        System.out.println(obj.d);

    }
}
