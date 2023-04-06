import java.util.Arrays;

public class CheckArraysEqual {
    public static void main(String[] args) {

        int arr1[] = {1,2,3,4,5,6};
        int arr2[] = {1,2,3,4,5,6};

        /*Boolean eq = Arrays.equals(arr1,arr2);/////////////////////
        System.out.println(eq);

        if(eq==true){
            System.out.println("Array values are equal");
        }
        else
            System.out.println("Arrays are not equal");
            */

        Boolean bool = true;
        for (int i = 0; i<arr1.length; i++){
            if(arr1[i]!=arr2[i]){
                bool=false;
            }
        }

        if(bool){
            System.out.println("Arrays are Equal");
        }
        else {
            System.out.println("Arrays are not Equal");
        }
    }

}
