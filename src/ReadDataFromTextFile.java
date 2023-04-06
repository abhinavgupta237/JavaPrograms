import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;

public class ReadDataFromTextFile {
    public static void main(String[] args) throws IOException {

        //Approach 1 using FileReader and BufferedReader
        FileReader fr = new FileReader("C:\\Users\\ishug\\OneDrive\\Desktop\\Test.txt");////////////////
        BufferedReader br = new BufferedReader(fr);//////////////////
        String str = "";
        while((str = br.readLine()) != null) {/////////////////
            System.out.println(str);
        }
        br.close();

        //Approach 2 using File and Scanner class
        File file = new File("C:\\Users\\ishug\\OneDrive\\Desktop\\Test.txt");
        Scanner sc = new Scanner(file);

        while(sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }

        //Approach 3 using file delimiter



    }
}
