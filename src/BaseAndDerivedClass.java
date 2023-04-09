class Base{
    Base(){
        System.out.println("This is the constructor of the Base class");
    }
    Base(int d){
        System.out.println("This is the constructor with argument of the Base class");
    }
    int x;
    public int getX() {
        return x;
    }
    public int setX(int x) {
        this.x = x;
        return this.x;
    }
}

class Derived extends Base{
    Derived(){
        super(5);
        System.out.println("This is the constructor of the Derived class");
    }
    Derived(int e, int f){
        System.out.println("The overloaded values of e and f are : " + e + " " + f );
    }

    int y;
    public int getY() {
        return y;
    }
    public int setY(int y) {
        this.y = y;
        return this.y;
    }
}

public class BaseAndDerivedClass {
    public static void main(String[] args) {
        //Creating object of the base class
        Base bobj = new Base();

        //Creating object of the derived class
        Derived dobj = new Derived(5,6);

        System.out.println(bobj.setX(11));
        System.out.println(dobj.setY(12));

    }
}
