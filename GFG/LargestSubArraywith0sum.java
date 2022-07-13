import java.util.Scanner;

public class LargestSubArraywith0sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                sum=arr[j]+arr[i];
                if(sum==0){
                    System.out.println((i+1) +" "+(j+1));
                }
            }
        }
    }
    
}
