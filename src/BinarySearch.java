import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        int arr[]  = {10,20,30,40,50,60,70,80,90,100,110};
      /*  boolean b = false;
        int l = 0;
        int h = arr.length;
       while (l<h) {
           int m = (l + h) / 2;
           if (arr[m] == key) {
               System.out.println("Key found at index " + m);
               b = true;
               break;
           } else if (arr[m] < key) {
               l = m + 1;
           } else if (arr[m] > key) {
               h = m - 1;
           }
       }
        if (!b) {
            System.out.println("Element not found");
        }
*/
        int c = Arrays.binarySearch(arr,key);
        if(c>=0) {
            System.out.println(c);
        }
        else System.out.println("Element not found");
        System.out.println("Verify the commit on Github");

    }
}
