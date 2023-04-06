public class ReverseEachWordinaString {
    public static void main(String[] args) {
        String str = "WELCOME TO JAVA";
        String reverseword = "";
        String reverseword1[];
        String word[] = str.split(" ");
        for (String w:word) {
            char chars[] = w.toCharArray();
            for (char d:chars) {
                reverseword = reverseword + d;
            }
           // reverseword1[] = reverseword;



        }
    }
}
