package Array.previous;
//

import java.util.Arrays;

public class LeftRotate {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        rotatebykOPT(arr , 3);
        System.out.println(Arrays.toString(arr));
    }

    static int[] leftRotateBy1(int[] arr){
        int temp = arr[0];
        for(int j = 1 ; j < arr.length;j++){
             arr[j-1]= arr[j];
        }
        arr[arr.length-1] = temp;
        return arr;
    }

    //brute force
    static  public int[] rotatebyk(int[] nums, int k) {
        k = k % nums.length;
        int[] temp = new int[k] ;
        int u =0;
        for(int j = 0 ; j < k ;j++ ){
            temp[j] = nums[j];
        }
        for(int i = k ; i < nums.length ; i++){
           nums[i-k] = nums[i];
           }
         for(int i = nums.length-k ; i < nums.length ; i++){
             nums[i] = temp[u];
             u++;
         }
   return nums;
    }

    //optimal solution
    static public void rotatebykOPT(int[] nums, int k) {
        k = k % nums.length;
        int n = nums.length;
        reverseNum(nums,0,n-1);
        reverseNum(nums,0,k-1);
        reverseNum(nums,k,n-1);
    }
    static void reverseNum(int[] nums , int start , int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}

