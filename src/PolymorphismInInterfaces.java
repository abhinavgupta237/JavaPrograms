
interface Camera {
    public void takePicture();
}

interface Calling {
    public void call();
}

public class PolymorphismInInterfaces implements Camera, Calling {
    public void takePicture() {
        System.out.println("This is take picture method");
    }

    public void call() {
        System.out.println("This is call method");
    }

    public static void main(String[] args) {
        Camera cm = new PolymorphismInInterfaces();
        Calling ca = new PolymorphismInInterfaces();

        cm.takePicture();
        ca.call();


    }
}
