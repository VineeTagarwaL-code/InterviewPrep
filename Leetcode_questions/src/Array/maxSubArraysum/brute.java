package Array.maxSubArraysum;

public class brute {
    public static void main (String args[]){
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = arr.length;
        int maxSum = maxSubArraysum(arr , n );
        System.out.println(maxSum);
    }
  
    //brute
    public static int maxSubArraysumB(int[] arr , int len){
        int maxi=0;
        for(int i = 0 ; i < len ; i++ ){

            for(int j = i ; j < len ; j++){
       

                int sum = 0;

                //add all the elements of subarray:
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
   

                maxi = Math.max(maxi , sum);
            }
        }
        return maxi;
    }

    //better
    public static int maxSubArraysum(int[] arr , int len){
        int maxi=0;
        for(int i = 0 ; i < len ; i++ ){
            int sum = 0;
            for(int j = i ; j < len ; j++){
       

                    sum+= arr[j];
   

                maxi = Math.max(maxi , sum);
            }
        }
        return maxi;
    }
}
