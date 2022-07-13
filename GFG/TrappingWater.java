import java.util.Scanner;

public class TrappingWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int res=0;
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < arr.length-2; i++) {
            sum=sum+arr[i+1];
        }
        if(arr[0]>=arr[n-1]){
            res=arr[n-2]*(n-2)-sum;
        }
        else{
            res=arr[0]*(n-2)-sum;
        }
        System.out.println(res);
        sc.close();
    }
    
}
