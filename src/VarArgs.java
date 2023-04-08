public class VarArgs {
    public static int sum(int ...a){
        int sum=0;
        for (int b:a) {
            sum = sum + b;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(1,2));
        System.out.println(sum(1,2,3));
        System.out.println(sum(1,2,3,4));
        System.out.println(sum(1,2,3,4,5));
        System.out.println(sum(1,2,3,4,5,6));
    }
}
