import java.util.*;

public class Practice1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        int[] x=new int[n];
        int[] y=new int[n];

        for (int i = 0; i < n; i++) {
            x[i]=sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            y[i]=sc.nextInt();
        }
        for (int i = 0; i < x.length-1; i++) {
            if(x[i]==y[i]){
                break;
            }
            else{
                int temp;
                temp=x[i+1];
                x[i+1]=x[i];
                x[i]=temp;
                x[i]=x[i+1];
                x[i+1]=x[i+1]-1;
                count++;
            }
        }
        System.out.print(count+" ");
        sc.close();
    }
}
