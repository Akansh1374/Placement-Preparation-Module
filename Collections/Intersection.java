import java.util.*
;
public class Intersection {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,5};
        int[] arr2={4,5};
        int count=1;
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            if(map.containsKey(arr1[i])){
                count=map.get(arr1[i]);
                count++;
            }
            else{
                count=1;
            }
            map.put(arr1[i],count);
        }
        for (int i = 0; i < arr2.length; i++) {
            if(map.containsKey(arr2[i])){
                int freq=map.get(arr2[i]);
                if(freq>0){
                    System.out.print(arr2[i]+" ");
                    map.put(arr2[i],freq-1);
                }
            }
        }
        //System.out.println(map);
    }
    
}
