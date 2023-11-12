package Algos.Sorting_Algo;


// |-----------------------------------------|
// |  Time Complexity  | Space Complexity    |
// |-----------------------------------------|
// | Best  | O(N^2)    |    NONE             |
// | Worst | O(N^2)    |    NONE             |
// |-----------------------------------------|


public class SelectionSort {
    public void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int max = getMaxIndex(arr, 0, last);
            swap(arr, max, last);
        }

    }

    public void swap(int[] arr , int first , int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last]=temp;
    }
    public int getMaxIndex(int[] arr , int start , int end){
        int max = start;
         for(int i = start ; i <=end ; i++){
             if(arr[max] < arr[i]){
                 max = i;
             }
         }
         return max;
    }
}
