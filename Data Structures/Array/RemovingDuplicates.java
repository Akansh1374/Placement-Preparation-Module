import java.util.*;

public class RemovingDuplicates {
    public static void main(String[] args) {
        int[] nums={1,2,3,3,3,4,5};

        for (int i = 0; i < nums.length-2; i++) {
            for (int j = i+1; j < nums.length-1; j++) {
                if(nums[i]==nums[j]){
                    nums[i+1]=nums[j+1];
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }
}
