public class BinarySearchRecursion {
    static int BinarySearch(int[]arr,int item,int LowerIndex,int HigherIndex){
        if(LowerIndex<=HigherIndex){
        int MiddleIndex=(LowerIndex+HigherIndex)/2;
        if(arr[MiddleIndex]==item){
            return MiddleIndex+1;
        }
        if(item<arr[MiddleIndex]){
            BinarySearch(arr,item,LowerIndex,MiddleIndex-1);
        }
        if(item>arr[MiddleIndex]){
            BinarySearch(arr,item,MiddleIndex+1,HigherIndex);
        }
    }
    return -1;
    }

    public static void main(String[] args) {
       int[] arr={1,2,3,4,5,6,7,8};
       int item=7;
       int LowerIndex=0;
       int HigherIndex=arr.length-1;
       BinarySearch(arr,item,LowerIndex,HigherIndex); 
    }    
}
