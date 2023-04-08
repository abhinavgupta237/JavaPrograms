public class FinallyProgram1 {

    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        while (b>=0){
            try {
                int c = a/b;
                System.out.println("Value of c is : " + c);
            }
            catch (Exception e){
                System.out.println(e);
            }
            finally {
                System.out.println("Finally Executed");
            }
            b--;
        }
    }
}
