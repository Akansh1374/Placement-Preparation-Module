import java.util.*;

public class Practice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        int count=0;
        int[] arr=new int[N];
        int[] res=new int[N+1];
        res[0]=0;
        for (int i = 0; i < N; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            res[i+1]=res[i]+arr[i];
        }
        for (int i = 0; i < res.length; i++) {
            if(res[i]<=K){
                count++;
            }
        }
        System.out.print(count+" ");
        sc.close();
    }
}
