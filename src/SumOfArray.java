public class SumOfArray {
    public static void main(String[] args) {
        int sum = 0;
        int ar[] = {1,2,3,4,5};
        for (int j : ar) {
            sum = sum + j;
        }
        System.out.println(sum);
    }
}
