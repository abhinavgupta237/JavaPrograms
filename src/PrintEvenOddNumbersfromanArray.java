public class PrintEvenOddNumbersfromanArray {
    public static void main(String[] args) {

        int ar[] = {1,2,3,4,5,6};
        for (int num:ar) {
            if(num%2==0){
                System.out.println(num + " is a even number");
            }
            else {
                System.out.println(num + " is a odd number");
            }

        }

    }
}
