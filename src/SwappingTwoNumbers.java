public class SwappingTwoNumbers {
    public static void main(String args[]){
        int a = 10;
        int b = 20;
        System.out.println("The initial value of a and b is: " +a+ " " +b);

        //Logic 1 using 3rd variable
        /*int temp = a;
        a = b;
        b = temp;
        System.out.println("The replaced value of a and b is: " +a+ " " +b);

        //Logic 2 using + and - operator. Without using 3rd variable
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("The replaced value of a and b is: " +a+ " " +b);

        //Logic 3 using + and - operator. Without using 3rd variable
        a = a*b;
        b = a/b;
        a = a/b;
        System.out.println("The replaced value of a and b is: " +a+ " " +b);

        //Logic 4 using ^(XOR) operator. Without using 3rd variable
        a = a^b;///////////////
        b = a^b;
        a = a^b;
        System.out.println("The replaced value of a and b is: " +a+ " " +b);*/

        //Logic 5 using single line
        b = a+b-(a=b);/////////////////////////
        System.out.println("The replaced value of a and b is: " +a+ " " +b);

    }
}
