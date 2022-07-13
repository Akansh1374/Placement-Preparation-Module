import java.util.*;

public class KthLargest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elemnts: ");
        int n=sc.nextInt();
        System.out.println("Which largest number you want to search: ");
        int k=sc.nextInt();
        int[] arr=new int[n];
        
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int temp;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(arr[j+1]<arr[j])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println(k+"th largest element is: ");
        System.out.println(arr[k-1]);
        sc.close();
    }  
}
