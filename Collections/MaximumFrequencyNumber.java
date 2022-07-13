import java.util.*;
 
public class MaximumFrequencyNumber {
    public static void main(String[] args) {
        int[] arr={32,14,14,76,14,32,29,76,76,32};
        int count=1;
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                count=map.get(arr[i]);
                count++;
            }
            else{
                count=1;
            }
            map.put(arr[i],count);
        }
        System.out.println(map);
        int max=0;
        int res=-1;
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getValue()>max){
                max=e.getValue();
                res=e.getKey();
            }
        }
        System.out.println(res+" ");
    }    
}
