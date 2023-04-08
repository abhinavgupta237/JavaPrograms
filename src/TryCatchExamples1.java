import java.util.Arrays;
import java.util.Scanner;

public class TryCatchExamples1 {
    public static void main(String[] args) {
        int arr[] = {10,20,30};
        System.out.println("Enter the number to divide");
        Scanner sc = new Scanner(System.in);
        int numToDivide = sc.nextInt();
        System.out.println("Enter the index of the element in the array ");
        try {
            int indexOfElement = sc.nextInt();
            int result = arr[indexOfElement]/numToDivide;
            System.out.println(result);
        }
        catch(ArithmeticException ae){
            System.out.println("Found Arithmetic Exception " + ae);
        }
        catch (ArrayIndexOutOfBoundsException aio){
            System.out.println("Found Array Index Out Of Bounds Exception " + aio);
        }
        catch (Exception e){
            System.out.println("Some exception occurred");
        }
    }
}
