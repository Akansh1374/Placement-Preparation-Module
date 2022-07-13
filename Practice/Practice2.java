import java.util.*;

public class Practice2 {
    public static void main(String[] args) {
        try{
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while(t-->0)
            {
                int sum=0;
                int n=sc.nextInt();
                int[] arr=new int[n];
                int a=n/2;
                for (int i = 0; i < arr.length; i++) {
                    arr[i]=sc.nextInt();
                }
                for (int i = a; i < n; i++) {
                    sum+=arr[i];
                }
                System.out.println(sum);
            }
            sc.close();
        }
        catch(Exception e)
        {
            return;
        }
    }
    
}
