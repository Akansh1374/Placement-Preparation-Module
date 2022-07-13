public class KadanesAlgo {
    public static void main(String[] args) {
        
        int[] arr={4,-2,-3,4,-1,-2,1,5,-3};
        int maxSoFar=0;
        int maxEndingHere=0;
        int start=0,s=0,end=0;
        for(int i=0;i<arr.length;i++)
        {
            maxEndingHere=maxEndingHere+arr[i];
            if(maxSoFar<maxEndingHere)
            {
                maxSoFar=maxEndingHere;
                start=s;
                end=i;
            }
            if(maxEndingHere<0)
            {
                maxEndingHere=0;
                s=i+1;
            }
        }
        System.out.println(" "+maxSoFar);
        System.out.println("Starting Element is: "+start);
        System.out.print("Last Element is: "+end);
    }
    
}
