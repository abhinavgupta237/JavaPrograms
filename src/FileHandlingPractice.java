import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingPractice {
    public static void main(String[] args) throws IOException {
        try {
            /*File fl = new File("Test1.txt");
            fl.createNewFile();

            FileWriter fileWriter = new FileWriter("Test1.txt");
            fileWriter.write("This is the first line\n");
            fileWriter.write("This is the second line");
            fileWriter.close();

            Scanner sc = new Scanner(fl);
            while (sc.hasNextLine()){
                String lines =  sc.nextLine();
                System.out.println(lines);
            }
            */
            File fl = new File("Test1.txt");
            fl.createNewFile();
            if(fl.delete()) {
                System.out.println("I have deleted " + fl.getName());
            }
            else {
                System.out.println("Some error occurred while deleting the file");
            }


        }
        catch (Exception e){
            System.out.println(e);
        }











    }
}
