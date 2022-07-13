public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int item=5;
        int LowerIndex=0;
        int HigherIndex=arr.length-1;
        int MiddleIndex=(LowerIndex+HigherIndex)/2;
        boolean flag=false;
        while(LowerIndex<=HigherIndex){
            if(item==arr[MiddleIndex]){
                System.out.println("Index is: "+(MiddleIndex+1));
                flag=true;
                break;
            }
            if(item<arr[MiddleIndex]){
                HigherIndex=MiddleIndex-1;
            }
            if(item>arr[MiddleIndex]){
                LowerIndex=MiddleIndex+1;
            }
            MiddleIndex=(LowerIndex+HigherIndex)/2;
        }
        if(flag==false){
            System.out.println("Element is not found");
        }
    }    
}
