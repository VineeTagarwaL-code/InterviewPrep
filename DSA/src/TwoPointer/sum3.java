package TwoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class sum3 {
    public static void main(String[] args) {
      System.out.println("hello there sum33");
      int[] nums = {2,7,11,15};
      int[ ] result = twoSum(nums , 9);
      System.out.println(Arrays.toString(result));

//      threeSum(nums);
    }

  static public List<List<Integer>> threeSum(int[] nums){
       Arrays.sort(nums);
      LinkedList<List<Integer>> sol = new LinkedList<List<Integer>>();
      for(int i = 0 ; i < nums.length -2 ; i++){
          if(i==0 || (i>0 && nums[i] != nums[i-1])){
              int target = 0-nums[i];
              int left = i+1;
              int right = nums.length-1;

              while(left < right){
                  if(nums[left] + nums[right] == target){
                      ArrayList<Integer> miniSol = new ArrayList<>();
                      miniSol.add(nums[i]);
                      miniSol.add(nums[left]);
                      miniSol.add(nums[right]);
                      sol.add(miniSol);

                      while(left < right && nums[left] == nums[left+1]){
                          left++;
                      }
                      while(left < right && nums[right] == nums[right-1]){
                          right--;
                      }
                      left++;
                      right--;
                  }else if(nums[left] + nums[right] > target){
                      right--;
                  }
                  else{
                      left++;
                  }
              }
          }
      }
      return sol;

    }

   static public int[] twoSum(int[] nums, int target) {

           for(int i = 0 ; i<nums.length ; i++){
               for ( int j = i+1 ; j<nums.length ; j++){
                   if(nums[i] + nums[j] == target){
                       return new int[] {i , j};
                   }
               }

           }
           return new int[] {};
       }




}
