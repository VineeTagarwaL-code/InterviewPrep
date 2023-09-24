package Array;

import java.util.Arrays;
import java.util.HashMap;

//https://leetcode.com/problems/two-sum/
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        TwoSum obj = new TwoSum();
        System.out.println(Arrays.toString(obj.twoSum(nums , 4)));
    }
//there can be multiple diff approaches to the same question
//#1 use two for loop to check every combination
//#2 use hashmap
  public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numMap = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++){
            int number = nums[i];
            int diff = target - number;

            if(numMap.containsKey(diff)){
                return new int[] {numMap.get(diff) , i };
            }
            numMap.put(number,i);
        }
        return new int[]{};
    }

}
