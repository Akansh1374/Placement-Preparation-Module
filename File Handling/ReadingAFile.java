import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadingAFile {
    public static void main(String[] args) {
        try {
            File myfile=new File("Me.txt");
            Scanner sc=new Scanner(myfile);
            while(sc.hasNext()){
                String line=sc.nextLine();    
                System.out.println(line);
            }
            sc.close();
        } catch (IOException e) {
            System.out.println("Unable to create a new file");
            e.printStackTrace();
        }
    }
}
