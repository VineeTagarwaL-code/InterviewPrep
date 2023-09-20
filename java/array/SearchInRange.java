/*
 * Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.
 */

public class SearchInRange {
    public int[] searchRange(int[] nums, int target) {
        int[] res ={-1,-1};
        res[0] = search(nums , target , true);
        if(res[0] != -1){
            res[1] = search(nums , target , false);
        }
        return res;

    }

    int search(int[] num , int target , boolean first){
        int start , end , mid ;
        start = 0 ;
        end = num.length-1;
        int ans = -1;
        while(start <= end){
            mid = start + (end-start)/2;
            if(target < num[mid]){
                end = mid-1;

            }else if(target > num[mid]){
                start = mid +1;

            }
            else{
                ans = mid;
                if(first){
                   end = mid-1;

                }else
                {
                    start = mid +1;
                }
            }
        }
        return ans;
    }
}
