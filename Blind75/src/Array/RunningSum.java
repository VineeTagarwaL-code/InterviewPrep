package Array;

import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
   int nums[] = {1,2,3,4};
   int nums2[] = {1,1,1,1,1};
   System.out.println(Arrays.toString(runningSum(nums2)));
    }
   static public int[] runningSum(int[] nums) {
    int[] result = new int[nums.length];
    result[0] = nums[0];

    for(int i = 1 ; i < nums.length ; i++){
        result[i] = result[i-1]+nums[i];
    }
    return result;
    }

    static public int sum(int[] nums , int lastIndex){
        int sum = 0;
        for(int i = 0 ; i <=lastIndex ; i++){
            sum+=nums[i];
        }
        return sum;
    }


}
