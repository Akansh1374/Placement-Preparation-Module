/**
 * PeakElement
 */
public class PeakElement {

    public static void main(String[] args) {
        int[] arr={15};
        System.out.println(peakElement(arr,1)); 
    }

    public static int peakElement(int[] arr,int n)
        {
            int res=-1;
            if(n==1){
                res=1;
                return res;
            }
            if(n>1){
            for (int i = 1; i < n-1; i++) {
                if(arr[i]>=arr[i-1]&&arr[i]>=arr[i+1]){
                    res=i;
                    return res;
                }
            }
            if(arr[0]>arr[1]){
                res=1;
            }
            if(arr[n-1]>arr[n-2]){
                res=n-1;
            }
            }
            return res;
    }
    
}