package Array;

import java.util.Arrays;

public class TopKFrequent {

    public static void main(String[] args) {
   int[] nums = {1,1,2,2,3};
        System.out.println(Arrays.toString(topKFrequent(nums , 2)));
    }
//never worked , lol !

   static public int[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);
        int[] result = new int[2];
        int j = 0 , index = 0;
        for(int i =0 ; i < nums.length-1 ; i++){
            if(j!=k && nums[i] == nums[i+1] && result[index] != nums[i]){
                result[index] = nums[i];
                index++;
                j++;
            }
        }
        return result;
    }
}
