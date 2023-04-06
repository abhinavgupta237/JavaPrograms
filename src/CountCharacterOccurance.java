public class CountCharacterOccurance {
    public static void main(String[] args) {
        String str = "Java Programming Language";
        int str_len = str.length();
        String new_str = str.replaceAll("a","");///////////////
        int new_str_len = new_str.length();
        int count = str_len - new_str_len;
        System.out.println(count);
    }

}
