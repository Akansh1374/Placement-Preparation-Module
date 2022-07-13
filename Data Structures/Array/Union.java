import java.util.*;

public class Union {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements of Array1: ");
        int m=sc.nextInt();
        System.out.println("Enter the number of elements of Array2: ");
        int n=sc.nextInt();
        int[] arr1=new int[m];
        int[] arr2=new int[n];
        System.out.println("Enter the elements in array1: ");
        for(int i=0;i<m;i++)
        {
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the elements in array2: ");
        for(int i=0;i<n;i++)
        {
            arr2[i]=sc.nextInt();
        }
        
        for(int i=0;i<m;i++)
        {
            System.out.print(" "+arr1[i]);
        }
        for(int j=0;j<n;j++)
        {
            int flag=0;
            for(int i=0;i<n;i++)
            {
                if(arr1[i]==arr2[j])
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                System.out.print(" "+arr2[j]);
            }
        }

        sc.close();
    }  
}
