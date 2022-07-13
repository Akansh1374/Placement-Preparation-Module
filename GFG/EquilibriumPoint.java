import java.util.*;
public class EquilibriumPoint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean flag=false;
        int[] arr=new int[n];
        if(n==1){
            System.out.println(1);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        for (int i = 1; i < arr.length-1; i++) {
            int leftIndex=i-1;
            int leftMostIndex=0;
            int rightIndex=i+1;
            int rightMostIndex=arr.length-1;
            int backwardSum=0;
            int forwardSum=0;
            for (int j = leftIndex; j >= leftMostIndex; j--) {
                backwardSum+=arr[j];
            }
            for (int k = rightIndex; k <= rightMostIndex; k++) {
                forwardSum+=arr[k];                
            }
            if(backwardSum==forwardSum){
                System.out.println(i+1);
                flag=true;
            }
        }
        if(!flag){
            System.out.println("-1");
        }
        sc.close();
    }
}
