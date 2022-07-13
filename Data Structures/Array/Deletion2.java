import java.util.*;

public class Deletion2 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,4,4,5,6};
        int val=4;
        int v=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=val){
                arr[v]=arr[i];
                v++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
