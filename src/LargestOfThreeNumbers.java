import java.util.Scanner;

public class LargestOfThreeNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        System.out.println("Enter third number");
        int c = sc.nextInt();

        //Approach 1
        /*if (a>b && a>c){
            System.out.println(a + " is greatest number.");
        }
        if (b>a && b>c){
            System.out.println(b + " is greatest number.");
        }
        if (c>a && c>b){
            System.out.println(c + " is greatest number.");
        }*/

        //Approach 2
        int largest1 = (a>b?a:b)>c?(a>b?a:b):c;////////////////////////////
        System.out.println(largest1 + " is the largest number");

    }
}
