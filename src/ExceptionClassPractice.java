import java.util.Scanner;

class myException extends Exception{
    public String toString(){
        return "I am toString";
    }
    public String getMessage(){
        return "I am getMessage";
    }
}

public class ExceptionClassPractice {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if(a<9){
            try {
                throw new myException();
            }
            catch (Exception e){
                System.out.println(e.toString());
                System.out.println(e.getMessage());
                e.printStackTrace();
                System.out.println("Finished");
            }
            System.out.println("Yes Finished");
        }
    }
}