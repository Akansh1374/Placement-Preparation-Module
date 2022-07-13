import java.util.*;

public class arrayleftrotation {
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
        arr[n]=arr[0];
        for(int i=0;i<n;i++)
        {
            arr[i]=arr[i+1];
        
        }
        for(int i=0;i<n;i++)
        {
        System.out.println(arr[i]);
        }
        sc.close();
    }

    
}
