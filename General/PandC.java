import java.util.Scanner;

public class PandC{
    public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    int fact1=1,fact2=1,fact3=1,res;
    System.out.println("Enter the n ");
    int n=sc.nextInt();
    System.out.println("Enter the r ");
    int r=sc.nextInt();

    for(int i=1;i<=n;i++){
        fact1=fact1*i;
        }
    for(int i=1;i<=r;i++){
        fact2=fact2*i;
        }
    for(int i=1;i<=n-r;i++){
        fact3=fact3*i;
        }
    res=fact1/(fact2*fact3);

    System.out.println(res);

    sc.close();
    }
    
}