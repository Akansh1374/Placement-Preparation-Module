import java.io.FileWriter;
import java.io.IOException;

public class WritingAFile{
    public static void main(String[] args) {
        FileWriter filewriter;
        try {
            filewriter = new FileWriter("Me.txt");
            filewriter.write("Hello my name is Akansh");
            filewriter.close();
        } catch (IOException e) {
            System.out.println("File cannot be written");
            e.printStackTrace();
        }
    }
}
