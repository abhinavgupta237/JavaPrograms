import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find the factorial");
        int num = sc.nextInt();
        int fact = 1;

        while(num!=1){
            fact = fact*num;
            num--;
        }
        System.out.println(fact);
    }
}
