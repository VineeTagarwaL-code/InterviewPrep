package Array;

import java.util.Arrays;
import java.util.HashMap;

//https://leetcode.com/problems/two-sum/
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        TwoSum obj = new TwoSum();
//        System.out.println(Arrays.toString(obj.twoSum(nums , 4)));

        System.out.println(Arrays.toString( optimal(nums , 5)));
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

    static int[] Brute(int[] nums  , int target){
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = i+1 ; j < nums.length ; j++){
                if( i ==j) continue;
                if(nums[i]+ nums[j] == target) return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }

//for better solution use hashmap
    static int[] optimal(int[] nums , int target){
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int left = 0;
        int right= nums.length-1;
        while(left < right){
            int sumation = nums[left] + nums[right];
            if(sumation== target){
                return new int[] {left , right};
            }
            else if( sumation < target ){
                left++;
            }else{
                right--;
            }
        }
        return new int[]{-1,-1};
    }
}
