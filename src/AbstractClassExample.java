abstract class Parent {
    public void methodA() {
        System.out.println("This is method A of Parent class");
    }

    //If one method of the class is abstract then the whole class needs to be abstract
    abstract public void methodC();///////////////////////
}

class Child extends Parent {
    public void methodB() {
        System.out.println("This is method B of Child class");
    }

    /* If we are extending any abstract class,then we have to define all the abstract methods of
    abstract class in our child class OR WE HAVE TO MAKE CHILD CLASS AS ABSTRACT CLASS*/

    @Override
    public void methodC() {////////////////////////////
        System.out.println("This is method C of Child class");
    }
}


public class AbstractClassExample {
    public static void main(String[] args) {
        //We cannot create the object of the Abstract class
        //Parent obj = new Parent();////////////////////////////////
        Child obj = new Child();
        obj.methodA();
        obj.methodB();
        obj.methodC();


    }
}
