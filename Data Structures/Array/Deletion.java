import java.util.*;

public class Deletion {
    public static void main(String[] args) {
        Integer[] arr={1,2,3,4,4,4,5,6};
        int target=4;
        ArrayList<Integer> list=new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        Collection<Integer> c = new ArrayList<Integer>();
        c.add(target);
        list.removeAll(c);
        int i = 0;
        for (i =0;i<list.size();i++) {
            arr[i]=list.get(i);
        }
        for (int j = i; j < arr.length; j++) {
            arr[j] = 0;
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]+" ");
        }
    }    
}
