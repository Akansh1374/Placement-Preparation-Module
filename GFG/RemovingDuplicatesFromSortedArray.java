import java.util.*;

public class RemovingDuplicatesFromSortedArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int j=1;
        for(int i=0; i<n-1; i++){
            if(arr[i]!=arr[i+1]){
                arr[j++] = arr[i+1];
            }
        }
        System.out.println(j+" ");
        sc.close();
    }
}
