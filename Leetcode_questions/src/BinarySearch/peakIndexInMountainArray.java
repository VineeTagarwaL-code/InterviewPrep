package BinarySearch;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class peakIndexInMountainArray {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,1,0};
        System.out.println(peakIndexInMountainArray(arr));
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
