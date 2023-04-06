public class MissingNumberinanArray {
    public static void main(String[] args) {
        int a[] = {1,2,4,5};
        int sum1 = 0;
        for(int i=0; i<a.length; i++){
            sum1 = sum1 + a[i];
        }
        System.out.println("Value of Sum1 is " + sum1);

        int a1[] = {1,2,3,4,5};
        int sum2 = 0;
        for (int i = 0; i<a1.length; i++){
            sum2 = sum2 + a1[i];
        }
        System.out.println("Value of Sum2 is " + sum2);

        int missingvalue = sum2 - sum1;
        System.out.println("Missing value is " + missingvalue);
    }
}
