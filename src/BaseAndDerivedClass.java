class Base{
    Base(){
        System.out.println("This is the constructor of the Base class");
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    int x;

}

class Derived extends Base{
    Derived(){
        System.out.println("This is the constructor of the Derived class");
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    int y;

}

public class BaseAndDerivedClass {
    public static void main(String[] args) {
        //Creating object of the base class
        Base bobj = new Base();

        //Creating object of the derived class
        Derived dobj = new Derived();




    }
}
