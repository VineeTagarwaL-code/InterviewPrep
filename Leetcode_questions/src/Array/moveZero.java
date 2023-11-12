package Array;

import java.util.Arrays;

public class moveZero  {
    public static void main(String[] args) {
        int[] arr = {1,0,2,3,4,0,0,0,4,1};
        moveZero(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void moveZero(int[] arr){
        int j =-1;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == 0){
                j=i;
                break;
            }
        }

        for(int i = j+1; i < arr.length ; i++){
         if(arr[i] !=0){
             swap(arr , i , j );
             j=j+1;
         }
        }
    }
    static void swap(int[] arr , int i ,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public void moveZeroes(int[] nums) {
        int i = 0;
        for(int num : nums){
            if(num != 0){
                nums[i] = num;
                i++;
            }
        }

        while( i <= nums.length-1){
            nums[i]=0;
            i++;
        }
    }
}
