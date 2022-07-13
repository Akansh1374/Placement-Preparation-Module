public class SubArrayOfSum {
    public static void main(String[] args) {
        int[] arr={1,2,3,7,5};
        int n=5;
        int s=12;
        int sum=0;
        /**
         * i=0
         * j = 1 -> 4
         * 0,1; 0,1,2;
         * 1,2;  1,2,3
         */
        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            sum=arr[i];
            for (int j = i+1; j < arr.length; j++) {
                sum+=arr[j];
                if(sum==s){
                    System.out.println("Values: "+(i+1)+" "+(j+1));
                    //break;
                    flag = false;
                }
            }
            if(!flag) break;
        }
        // for(int i=0;i<n;i++){
        //     sum=0;
        //     for(int j=i+1;j<n;j++){
        //         sum+=arr[i]+arr[j];
        //         System.out.println("i: "+i+" j: "+j+" sum: "+sum);
        //         

        //         }
        //     }
        // }
    }    
}
