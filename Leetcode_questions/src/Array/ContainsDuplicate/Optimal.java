package Array.ContainsDuplicate;

import java.util.HashSet;
import java.util.Set;

public class Optimal {

    public static void main(String[] args) {
        int[] nums = {1,2,4,5};
        System.out.println(optimal(nums));
    }


    // any suggestions ?
    public static boolean optimal(int[] nums){
        Set<Integer> setHai = new HashSet<>();
        for(int i = 0 ; i < nums.length ; i++){
            if(setHai.contains(nums[i])){
                return true;
            }
            setHai.add(nums[i]);
        }
        return false;
    }

}
