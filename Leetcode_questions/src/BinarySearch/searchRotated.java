package BinarySearch;

public class searchRotated {
    public static void main(String[] args) {
  int arr[] = {4,5,6,7,0,1,2};
  System.out.println(search(arr , 3));
    }

    static public int search(int[] nums, int target) {
     int peak = peakIndexInMountainArray(nums);
     int firstTry = BinarySearchint(nums , target , 0,peak);
     if(firstTry != -1){
         return firstTry;
     }
     return BinarySearchint(nums , target , peak,nums.length-1);
    }

    static int BinarySearchint (int arr[] , int target , int start , int end){
        while(start <= end){
            int mid = start+(end-start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid] > target ){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }
    static public int peakIndexInMountainArray(int[] arr) {
        int start = 0 ;
        int end = arr.length-1;
        while(start < end){
            int mid = start + (end-start)/2;
            if(arr[mid] > arr[mid+1]){
                end = mid;
            }else{
                start = mid+1;
            }
        }
        return end;
    }
}
