package Array.twosum;

import java.util.Arrays;

public class optimal {
        public static void main(String[] args){
        int[] nums= {3,2,4};
        int len = nums.length;
        System.out.println(Arrays.toString(optimal(nums , len , 6)));
    }

    public static int[] optimal(int[] arr , int len , int target){
        Arrays.sort(arr);
        int left = 0 , right = len-1;

        while(left < right){
            int sum = arr[left] + arr[right];
            if(sum == target){
                return new int[] {left , right};
            }
            if(sum < target){
                left++;
            }else{
                right--;
            }
        }

        return new int[] {-1,-1};
    }
}
