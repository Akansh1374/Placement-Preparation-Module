import java.util.Scanner;

public class append {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        int[] arr = new int[100];
        System.out.println("Enter the number of elements: ");
        int n=sc.nextInt();
        System.out.println("Enter the values: ");
        for(int i=0;i<n;i++){
            int b=sc.nextInt();
            arr[i]=b;
        }
        System.out.println("Enter the value which is to be added: ");
        int a=sc.nextInt();

        arr[n]=a;

        for(int i=0;i<n+1;i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
