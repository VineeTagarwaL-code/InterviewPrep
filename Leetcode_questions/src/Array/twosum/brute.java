package Array.twosum;
import java.util.*;
public class brute {
    public static void main(String[] args){
        int[] nums= {3,2,4};
        int len = nums.length;
        System.out.println(Arrays.toString(brute(nums , len , 5)));
    }


    // time complexity - o(n^2)
    public static int[] brute(int[] nums , int len , int target){
        for(int i = 1; i < nums.length; i++){
            for(int j = i; j < nums.length; j++){
                int sum = nums[j] + nums[j-i];
                if (sum == target){
                    return new int[]{j, j - i};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
