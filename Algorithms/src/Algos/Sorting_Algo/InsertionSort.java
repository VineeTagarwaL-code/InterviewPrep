package Algos.Sorting_Algo;


// |-----------------------------------------|
// |  Time Complexity  | Space Complexity    |
// |-----------------------------------------|
// | Best  | O(N)      |    NONE             |
// | Worst | O(N^2)    |    NONE             |
// |-----------------------------------------|


public class InsertionSort {
    public void InsertionSort(int[] arr){
        for(int i = 0 ; i < arr.length-1 ; i++){
            for(int j = i+1; j > 0 ; j--){
                if(arr[j] < arr[j-1]){
                    swap(arr , j , j-1);
                }else{
                    break;
                }
            }
        }
    }

    public void swap(int[] arr , int first , int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last]=temp;
    }
}
