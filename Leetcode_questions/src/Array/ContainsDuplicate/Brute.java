package Array.ContainsDuplicate;

public class Brute {

    public static void main(String[] args) {
        int[] nums = {1,2,4,5};
        System.out.println(brute(nums));
    }



    
    public static boolean brute(int[] nums){
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = i+1 ; j < nums.length ; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }



}


// Time Complexity : O(n^2)