public class ReverseAnArray {
    public static void main(String[] args) {

        int temp;
        int[] arr={1,2,3,4,5,6,7,8};
        for(int i=0;i<(arr.length)/2;i++)
        {
            temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}
