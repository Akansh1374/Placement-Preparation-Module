import java.util.*;

public class arrays6 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=sc.nextInt(); 
        int[] arr=new int[n];
        System.out.println("Enter the values: ");
        for(int i=0;i<n;i++){
            int d=sc.nextInt();
            arr[i]=d;
        }

        System.out.println("Enter the position to be replaced: ");   
        int a=sc.nextInt();     
        if(a>arr.length){
            System.err.println("The value is greater than the array");
        }
        System.out.println("Enter the new value: ");   
        int b=sc.nextInt();  

        for(int i=0;i<n;i++){
            if(i==a){
                arr[i]=b;
                break;
            }
        }
        
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        sc.close(); 
    }
    
}
