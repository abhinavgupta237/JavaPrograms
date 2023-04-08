public class TryCatchExamples {
    public static void main(String[] args) {

        int a =10;
        try{
            System.out.println(a/0);
        }
        catch (Exception e) {/////////////////////////
            System.out.println("We are not able to divide a by 0. Reason: ");
            System.out.println(e);
        }
    }
}
