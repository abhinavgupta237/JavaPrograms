public class CountNumberOfEVENODDDigitsinANumber {
    public static void main(String[] args) {

        int num = 123456;
        int evennums = 0;
        int oddnums = 0;
        int rem;

        while (num>0){
            rem = num%10;
            if(rem%2==0){
                evennums++;
            }
            else {
                oddnums++;
            }
            num = num/10;
        }
        System.out.println("Number of even digits are : " + evennums);
        System.out.println("Number of odd digits are : " + oddnums);
    }
}
