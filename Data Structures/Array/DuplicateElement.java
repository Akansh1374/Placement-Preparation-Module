import java.util.*;

public class DuplicateElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n=sc.nextInt();
        int[] arr=new int[n];

        System.out.println("Enter the elements in array: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int flag=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j]&&i!=j)
                {
                    System.out.println("Duplicated element is: "+arr[i]);
                    flag=1;
                }
            }
        }
        if(flag==0)
        {
            System.out.println("There are no duplicate elements");
        }
        //for(int i=0;i<n;i++)
        //{
        //    System.out.print(arr[i]+" ");
        //}
        sc.close();
    }
}
