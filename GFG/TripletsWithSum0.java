import java.util.Arrays;

public class TripletsWithSum0 {
    public static void main(String[] args) {
        int[] arr={0,1,2,-1};
        Arrays.sort(arr);
        int count=0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int sum=arr[i]+arr[j];
                sum=sum*(-1);

                int index=Arrays.binarySearch(arr,sum);
                if(index!=-1){
                    count++;
                }
            }
        }
        System.out.println(count);
    } 
}
