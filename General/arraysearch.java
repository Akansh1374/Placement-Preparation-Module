import java.util.Scanner;

public class arraysearch {
        public static void main(String args[]){
    
            Scanner sc=new Scanner(System.in);
            int i;
            System.out.println("Enter the number of elements: ");
            int n=sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the values: ");
            for(i=0;i<n;i++){
                int b=sc.nextInt();
                arr[i]=b;
            }
            System.out.println("Enter the value which is to be searched: ");
            int a=sc.nextInt();

            int flag=0;
            for(i=0;i<n;i++){
                if(arr[i]==a){
                    System.out.println("The postion is: "+(i+1)+"th");
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println("Element not found.");
            }
            sc.close();
        }
}