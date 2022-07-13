import java.util.*;

public class arraysum 
{
        public static void main(String args[])
        {
            int sum=0;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number of elements: ");
            int n=sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the values: ");
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
           for(int i=0;i<n;i++)
           {
                sum=sum+arr[i];
           } 
           System.out.println("Sum is: "+sum);
        }
    }        
            