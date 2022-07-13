import java.util.*;

public class fibonacci{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int f=0,s=1,t=0;
        System.out.println("enter the number ");
        int n=sc.nextInt();
        System.out.print(f+",");
        System.out.print(s+",");


        for(int i=0;i<=n-3;i++){
            t=s+f;
            f=s;
            s=t;
            System.out.print(t+",");


        }


    
    sc.close();
        



    }
    

    
}
