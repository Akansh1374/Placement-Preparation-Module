import java.io.File;
import java.io.IOException;

public class CreatingAFile {
    public static void main(String[] args) {
        File myfile = new File("Me.txt");
        try {
            myfile.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to create a new file");
            e.printStackTrace();
        }
    }
}
