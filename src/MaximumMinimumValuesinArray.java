public class MaximumMinimumValuesinArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,5,4,3,22};
        int max = 0;
        for (int i:arr) {
            if(i>max){
                max = i;
            }
        }
        System.out.println("The max value present in array is :" + max);

    }

}
