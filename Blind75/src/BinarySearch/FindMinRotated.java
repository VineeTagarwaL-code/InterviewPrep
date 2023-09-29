package BinarySearch;

public class FindMinRotated {
    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
        System.out.println(findThePeak(nums));
    }

   static public int findMin(int[] nums) {
   int peakIndex = findThePeak(nums);
   if(peakIndex == nums.length-1){
       return nums[0];
   }
   return nums[peakIndex+1];
    }

    static int findThePeak(int[] nums ) {
        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            if (nums[l] <= nums[r]) {
                return nums[l];
            }

            int mid = (l + r) / 2;
            if (nums[mid] >= nums[l]) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return 0;
    }
}
