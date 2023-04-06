public class CountTheWords {
    public static void main(String[] args) {
        String s = "Selenium Java Automation";
        int count = 1;
        for(int i=0;i<s.length()-1;i++){
            if (s.charAt(i)==' ') {
                System.out.println();
                count++;
            }
        }
        System.out.println("Number of words are " + count);
    }
}
