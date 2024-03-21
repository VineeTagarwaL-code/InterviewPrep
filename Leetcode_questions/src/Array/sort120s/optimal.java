package Array.sort120s;

import java.util.Arrays;

public class optimal {
     public static void main(String[] args) {
        int[] arr={0,0,1,2,1,0,0,1,2,0};
        DNFalgoForSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    public static void DNFalgoForSort(int[] arr){
        int low = 0 ;
        int mid = 0 ;
        int high = arr.length-1;

        while(mid <= high){
            if(arr[mid] == 1){
                mid++;
            }else if(arr[mid] == 0 ){
                swap(arr , low , mid);
                low++ ;
                mid++;
            }else{
                swap(arr, mid , high);
                high--;
            }
        }
    }

    public static void swap(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
