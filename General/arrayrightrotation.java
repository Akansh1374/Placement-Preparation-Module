import java.util.*;

public class arrayrightrotation {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n=sc.nextInt();
        int[] arr=new int[20];
    
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=n;i>0;i--)
        {
            arr[i]=arr[i-1];   
        }
        arr[0]=arr[n];
        for(int i=0;i<n;i++)
        {
        System.out.println(arr[i]);
        }
        sc.close();
    }

    
}
