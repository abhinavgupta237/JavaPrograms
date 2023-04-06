import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int orgnum = sc.nextInt();
        int num = orgnum;
        int rev = 0;
        while (num!=0){
            rev = rev*10 + num%10;
            num = num/10;
        }
        if(rev==orgnum){
            System.out.println("This is a palindrome number");
        }
        else{
            System.out.println("This is not a palindrome number");
        }
    }
}
