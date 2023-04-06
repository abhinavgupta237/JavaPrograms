import java.util.HashSet;

public class DuplicateElementsinArray {
    public static void main(String[] args) {
        int arr[] = {9,8,4,7,5,6,2,1,0,3,4,5};
        /*int repeatednumber = 0;
        //for (int i:arr) {
        for(int b =0; b<arr.length; b++){
            int i=arr[b];
            int count = 0;
            for (int a = b; a < arr.length; a++) {
                if (arr[a] == i) {
                    count++;
                }
            }
            if(count>1) {
                System.out.println("Number " + i + " is displayed " + count + " times");
            }
        }*/
        HashSet <Integer> hsetobj = new HashSet();
        for (int a:arr) {
            boolean b = hsetobj.add(a);/////////////////////////////////
            if(b==false){
                System.out.println("Number " + a + " has duplicate value");
            }
        }
    }
}
