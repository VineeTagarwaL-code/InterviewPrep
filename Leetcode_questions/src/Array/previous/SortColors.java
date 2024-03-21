package Array.previous;

import java.util.Arrays;

//https://leetcode.com/problems/sort-colors/description/
//DNF - [0...low-1] 0
// [low ... mid-1] 1
// [high+1 .... n-1]2
public class SortColors {
    public static void main(String[] args) {
        int[] arr={0,0,1,2,1,0,0,1,2,0};
        DNFalgoForSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void DNFalgoForSort(int[] arr){
        int low = 0;
        int mid = 0;
        int high = arr.length-1;
       while( mid <= high){
           if(arr[mid] == 0){
               swap(arr , low , mid);
               low++; mid++;
           }else if(arr[mid] == 1){
               mid++;
           }else{
               swap(arr , mid , high );
               high--;
           }
       }
    }

    static void swap(int[] nums , int i , int j){
        int temp= nums[i];
        nums[i] = nums[j];
        nums[j]=temp;
    }
}
