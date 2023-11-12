package Algos.Sorting_Algo;


// |-----------------------------------------|
// |  Time Complexity  | Space Complexity    |
// |-----------------------------------------|
// | Best  | O(N)      |    NONE             |
// | Worst | O(N^2)    |    NONE             |
// |-----------------------------------------|


public class BubbleSort {

    public void BubbleSort(int[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr.length-1-i ; j++){
                if(arr[j] > arr[j+1]){
                    swap(arr , j , j+1);
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
