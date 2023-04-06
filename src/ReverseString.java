import java.util.Scanner;

public class ReverseString {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        String rev = "";
        //1. Using String Concatenation operator
       /* int StringLength = st.length();
        for (int i=StringLength-1;i>=0;i--){
            char c = st.charAt(i);////////////////////
            rev = rev.concat(String.valueOf(c));////////////////////
        }*/

        //2. Using Character array
        /*char arr[] = st.toCharArray();////////////////////
        for(int i = arr.length-1;i>=0;i--){
            rev = rev + arr[i];
        }*/

        //3. Using String Buffer class
        StringBuffer sb = new StringBuffer(st);//////////
        StringBuffer rev1 = sb.reverse();/////////////
        System.out.println(rev1);

    }
}