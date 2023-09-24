package Array;

import java.util.*;

//https://leetcode.com/problems/contains-duplicate/description/
public class ContainsDuplicate {
    public static void main(String[] args) {
       int[] nums = {1,2,3,1};
       System.out.println(approach1(nums));
        System.out.println(containsDuplicate(nums));

    }

    static boolean approach1(int[] nums){
        Arrays.sort(nums);
        for(int i = 0 ; i <nums.length-1 ;i++){
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }

    static public boolean containsDuplicate(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for(int i = 0 ; i < nums.length ; i++){
            if(numSet.contains(nums[i])){
                return true;
            }
            numSet.add(nums[i]);
        }
        return false;
    }


}
