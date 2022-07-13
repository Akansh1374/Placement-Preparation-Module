import java.util.Scanner;
public class Addition {
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int b=a.nextInt();
        System.out.println("Enter your second number: ");
        int c=a.nextInt();
        a.close();
        int d=b+c;
        System.out.println("Addition is: "+d);
        }
}