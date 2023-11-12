package BinarySearch;

import java.util.Arrays;

public class searchRange {
    public static void main(String[] args) {
        int[] arr= {5,7,7,8,8,10};
        System.out.println(Arrays.toString(getRange(arr,7)));
    }
//    somewhat a good solution will pass 22 cases out of 88 ( expected this )
    static  public int[] approach1(int[] nums, int target) {
        int start= 0;
        int end = nums.length-1;

        while(start <= end){
            int mid = start+(end-start)/2;
            if(nums[mid] == target){
                return new int[]{mid-1 , mid};
            }
            if(nums[mid] > target ){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return new int[]{-1,-1};
    }

    //a more optimized approach
    static int[] getRange(int[] num , int target){
        int[] result = {-1,-1};
        boolean findStartIndex = true;
        result[0] = approach2(num , target , findStartIndex);
        if(result[0] != -1){
            result[1] = approach2(num , target , false);
        }
        return result;
    }

    static  public int approach2(int[] nums, int target , boolean findStartIndex) {
        int start= 0;
        int ans =-1;
        int end = nums.length-1;

        while(start <= end){
            int mid = start+(end-start)/2;

            if(nums[mid] > target ){
                end = mid-1;
            }else if(nums[mid] < target) {
                start = mid + 1;
            }else {

                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;

                } else {
                    start = mid + 1;
                }
            }
                }
                return ans;
            }



        }






