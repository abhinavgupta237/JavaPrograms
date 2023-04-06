import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoTextFile {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("C:\\Users\\ishug\\OneDrive\\Desktop\\Test123.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Line 1");
        bw.write("Line 2");
        bw.write("Line 3");

        System.out.println("Finished!!!!");
        bw.close();
    }
}
