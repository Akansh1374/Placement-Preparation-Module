import java.util.*;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if(arr[i]!=arr[i+1]){
                System.out.println(-1);
            }
        }
        
    }
}
