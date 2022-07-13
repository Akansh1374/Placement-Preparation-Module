import java.util.*;
public class LeadersInAnArray  {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        int n=sc.nextInt();
        int[] arr=new int[n];
        int max=arr[arr.length-1];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = n-1; i >=0; i--) {
            if(max<arr[i]){
                max=arr[i];
                System.out.println(max);
            }
        }
    }
}