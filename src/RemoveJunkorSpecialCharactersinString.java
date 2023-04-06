public class RemoveJunkorSpecialCharactersinString {
    public static void main(String[] args) {
        String s = "!@#$%^&*() testing regular expression in java";
        s = s.replaceAll("[^0-9a-zA-Z ]","");///////////////////////////
        System.out.println(s);

    }

}
