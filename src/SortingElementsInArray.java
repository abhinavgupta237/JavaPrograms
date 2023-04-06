import java.util.Arrays;
import java.util.Collections;

public class SortingElementsInArray {
    public static void main(String[] args) {
        Integer arr[] =  {2,1,4,6,3,5};
        //Approach 1 using ParallelSort method
/*        System.out.println("Elements before sorting " + Arrays.toString(arr));
        Arrays.parallelSort(arr);
        System.out.println("Elements after sorting " + Arrays.toString(arr));

        //Approach 2 using Sort method
        System.out.println("Elements before sorting " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Elements after sorting " + Arrays.toString(arr));*/

        //Approach 3 using Collections.reverseorder()
        System.out.println("Elements before sorting " + Arrays.toString(arr));
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Elements after sorting " + Arrays.toString(arr));

    }
}
