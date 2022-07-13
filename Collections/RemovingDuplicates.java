import java.util.*;
 
public class RemovingDuplicates {
    public static void main(String[] args) {
        int[] arr={1,3,2,2,3,1,6,2,5};

        HashMap<Integer,Boolean> map=new HashMap<>();
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                continue;
            }
            map.put(arr[i],true);
            list.add(arr[i]);
        }
        System.out.println(list);
    }    
}
