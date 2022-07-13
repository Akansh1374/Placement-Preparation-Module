import java.util.Scanner;

public class arraymin{
    public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter the number of elements");
    int a=sc.nextInt();
    int arr[]=new int[a];
    for(int i=0;i<a;i++){
        int b=sc.nextInt();
        arr[i]=b;
    }
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min)
            min=arr[i];
    }
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println("\n Minimum value is "+min);
    sc.close();
    }
}