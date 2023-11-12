package Array;

import java.util.*;

//https://leetcode.com/problems/majority-element/description/
public class MajorityElement {
    public static void main(String[] args) {
        int[] nums= {2,2,3,1,2,2};
        System.out.println(majorityElemetOptimal(nums));
    }

    static public int majorityElementBRUTE(int[] nums) {
        int count = 0;
    for(int i = 0 ; i < nums.length ; i++){
        for(int j= 0 ; j < nums.length-1 ; j++){
            if(nums[j] == nums[j+1]){
                count++;
            }
            if(count > (nums.length/2)){
                return nums[i];
            }
        }
    }
    return -1;
    }


    static public int majorityElementBetter(int[] nums){
        int n = nums.length;
        Map<Integer, Integer> mpp = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int value = mpp.getOrDefault(nums[i], 0);
            mpp.put(nums[i], value + 1);
        }
        for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
            if (it.getValue() > (n / 2)) {
                return it.getKey();
            }
        }
        return -1;
    }


    //moore's voting algo

    static int majorityElemetOptimal(int[] nums){

        int cnt=0;
        int el=nums[0];
        for(int i = 0 ; i < nums.length ; i++){
            if(cnt==0){
                el=nums[i];
                cnt=1;
            }else if(nums[i] == el){
                cnt++;
            }else{
                cnt--;
            }
        }

        int countTimes= 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == el){
                countTimes++;
            }
        }

        if(countTimes > (nums.length/2)){
            return countTimes;
        }
        return -1;
    }

}
