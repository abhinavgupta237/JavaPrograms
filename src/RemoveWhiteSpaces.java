public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        String str = "    Selenium    Java Webdriver  ";
        str = str.replaceAll("[\\s]","");
        System.out.println(str);
    }
}
