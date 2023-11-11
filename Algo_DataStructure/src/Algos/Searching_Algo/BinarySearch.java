package Algos.Searching_Algo;


// |-----------------------------------------|
// |  Time Complexity  | Space Complexity    |
// |-----------------------------------------|
// | Best  | O(1)      |    NONE             |
// | Worst | O(Log2N)  |    NONE             |
// |-----------------------------------------|

public class BinarySearch {

    public int BinarySearch(int[] arr , int target){
        int start=0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }

    public int BinarySearchRecursion(int[] arr , int target , int start , int end){


        if(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target){
               return BinarySearchRecursion( arr , target , start  , mid-1);
            }else{
                return BinarySearchRecursion( arr , target , mid+1  , end);
            }
        }
        return -1;
    }

}
