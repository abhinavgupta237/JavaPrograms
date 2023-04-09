class Phone {
    public static void ring(){
        System.out.println("Phone is ringing");
    }
    public static void music(){
        System.out.println("Phone is playing music");
    }
    public static void wire(){
        System.out.println("Phone is charging through wire");
    }
}

class SmartPhone extends Phone {
    public static void ring(){
        System.out.println("Smartphone is ringing");
    }
    public static void music(){
        System.out.println("Smartphone is playing music");
    }
    public static void wireless(){
        System.out.println("Smartphone is charging wireless");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Phone obj = new SmartPhone();
        obj.ring();
        obj.music();
        obj.wire();
        //obj.wireless();///////////////////////////
    }
}
