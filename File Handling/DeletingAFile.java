import java.io.File;
import java.io.IOException;

public class DeletingAFile {
    public static void main(String[] args) {
        File myfile = new File("Me.txt");
        try {
            myfile.delete();
        } catch (IOException e) {
            System.out.println("Unable to create a new file");
            e.printStackTrace();
        }
    }
}
