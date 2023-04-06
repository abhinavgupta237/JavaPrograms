import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        //Condition 1: Number should be greater than 1
        //Condition 2: Number should have only 2 factors. 1 and itself.

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rem = 0;
        if(num>1){
            for(int i=2; i<num; i++){
                rem = num%i;
                if(rem==0){
                    System.out.println("It is not a prime number");
                    break;
                }
                if(rem!=0){
                    System.out.println("It is a prime number");
                    break;
                }
            }
        }
    }
}
