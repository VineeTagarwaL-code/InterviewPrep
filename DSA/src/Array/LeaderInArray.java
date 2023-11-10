package Array;
/*
* Write a program to print all the LEADERS in the array. An element is a leader if it is greater than all the elements to its right side. And the rightmost element is always a leader.

For example:

    Input: arr[] = {16, 17, 4, 3, 5, 2},
    Output: 17, 5, 2

    Input: arr[] = {1, 2, 3, 4, 5, 2},
    Output: 5, 2
* */


import java.util.Arrays;

public class LeaderInArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 2};
        int[] result = leader(nums);
        for(int n : result){
            if(n!=0)
             System.out.print(n +" ,");
        }

    }

    static int[] leader(int[] nums){
        int size = nums.length;
        int[] result = new int[size];
        int max = Integer.MIN_VALUE;
        int k =0;
        for(int i = size-1 ; i > -1 ; i-- ){
             if(nums[i] > max){
                 max = nums[i];
                 result[k++] = max;
             }
        }
        return result;
    }
}
