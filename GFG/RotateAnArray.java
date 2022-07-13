import java.util.ArrayList;
import java.util.Scanner;

public class RotateAnArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < d; i++) {
            list.add(arr[i]);
        }
        for (int i = d; i < arr.length; i++) {
            arr[i-d]=arr[i];
        }
        for (int i = n-d; i < n; i++) {
            arr[i]=list.get(i-n+d);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    
}
