import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        char arr[] = word.toCharArray();
        int arrlen = arr.length;
        String revstr = "";
        for(int i = arrlen-1;i>=0;i--){
            revstr = revstr.concat(String.valueOf(arr[i]));
        }


        if(word.equals(revstr)){
            System.out.println("This a palindrome String");
        }
        else {
            System.out.println("This is not a palindrome String");
        }
    }
}
