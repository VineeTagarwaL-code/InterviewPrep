package Sorting_Algo;


// |-----------------------------------------|
// |  Time Complexity  | Space Complexity    |
// |-----------------------------------------|
// | Best  | O(log2N)  |    NONE             |
// | Worst | O(N^2)    |    NONE             |
// |-----------------------------------------|


public class QuickSort {

    public void sort(int[] nums , int low , int high){

        if(low >= high){
            return;
        }

        int s= low;
        int e = high;

        int m = s + (e-s)/2;
        int pivot = nums[m];
        while(s <= e){
            while(nums[s] < pivot){
                s++;
            }

            while(nums[e] > pivot){
                e--;
            }
            if(s <= e){
             int temp = nums[s];
             nums[s] = nums[e];
             nums[e]=temp;
             s++;
             e--;
            }
        }
        sort(nums , low , e );
        sort(nums , s , high);

    }
}
