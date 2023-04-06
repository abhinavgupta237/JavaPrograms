public class SumOfDigitsinaNumber {
    public static void main(String[] args) {

        int num = 123456;
        int rem;
        int sum = 0;
        while(num>0){
            rem = num%10;
            sum = sum + rem;
            num = num/10;
        }
        System.out.println("The sum of the digits is : " + sum);
    }
}
