public class FinallyProgram {
    public static int greet(){
        int a = 50;
        int b = 5;
        try {
            int c = a/b;
            System.out.println(c);
            return c;
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Finally block executed");
        }
        return 0;
    }
    public static void main(String[] args) {

        int k = greet();
        if(k!=0){
            System.out.println("The value after division is : " + k);
        }
        else{
            System.out.println("Exception occurred. Value of b is not allowed as 0");
        }
    }
}
