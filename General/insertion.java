import java.util.*;
public class insertion{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        System.out.println("Enter the number of elements: ");
        int n=sc.nextInt();
        System.out.println("Enter the values: ");
        for(int i=0;i<n;i++){
            int b=sc.nextInt();
            arr[i]=b;
        }
        System.out.println("Enter the position: ");
        int a=sc.nextInt();
        if(a>=n)
            System.err.println("Invalid Choice of Position");
        System.out.println("Enter the element to insert it in array: ");
        int element = sc.nextInt();
        int j;
        for(j=n; j!=a; j--)
            arr[j]=arr[j-1];
        arr[j]=element;   
        for(int i=0;i<n+1;i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }
}