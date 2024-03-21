package Array.previous;
//https://leetcode.com/problems/maximum-subarray/description/
public class MaxSubarray {

    public static void main(String[] args) {
    int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
    System.out.println(maxSubArray(arr));
    }

   static public int maxSubArray(int[] nums) {
   int maxi = Integer.MIN_VALUE;
   int size = nums.length;
   for(int i = 0 ; i < size ; i++){
       int sum = 0;
       for(int j = i ; j < size ; j++){

           for(int k = i ; k <= j ; k++){
               sum+=nums[k];
           }

           maxi = Math.max(sum , maxi);
       }
   }
   return maxi;
    }





    static public int maxSubArrayBetter(int[] nums) {
        int maxi = Integer.MIN_VALUE;
        int size = nums.length;
        for(int i = 0 ; i < size ; i++){
            int sum = 0;
            for(int j = i ; j < size ; j++){


                sum+=nums[j];

                maxi = Math.max(sum , maxi);}

        }

        return maxi;
    }


    public static long maxSubArrayOPTIMAL(int[] arr, int n) {
        long maxi = Long.MIN_VALUE; // maximum sum
        long sum = 0;

        for (int i = 0; i < n; i++) {

            sum += arr[i];

            if (sum > maxi) {
                maxi = sum;
            }

            // If sum < 0: discard the sum calculated
            if (sum < 0) {
                sum = 0;
            }
        }

        // To consider the sum of the empty subarray
        // uncomment the following check:

        if (maxi < 0) maxi = 0;

        return maxi;
    }
}
