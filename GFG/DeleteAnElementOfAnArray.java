import java.util.*;

public class DeleteAnElementOfAnArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int k=sc.nextInt();
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==k){
                count++;
                for (int j = i; j < arr.length-1; j++) {
                    arr[i]=arr[i+1];
                }
            }
        }
        for (int i = 0; i < arr.length-count; i++) {
            System.out.print(arr[i]+" ");
        }
    }    
}
