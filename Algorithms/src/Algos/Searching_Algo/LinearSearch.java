package Algos.Searching_Algo;


// |-----------------------------------------|
// |  Time Complexity  | Space Complexity    |
// |-----------------------------------------|
// | Best  | O(1)      |    NONE             |
// | Worst | O(n)      |    NONE             |
// |-----------------------------------------|


public class LinearSearch {

    public int linear(int[] array , int target){
        for(int i = 0 ; i < array.length ; i++){
            if(array[i] == target){
                return i;
            }
        }
        return -1;
    }


    public int linearRecursion(int[] arr , int target , int index){
        if(arr[index] == target){
            return index;
        }
        if(index > arr.length-1){
            return -1;
        }
        return linearRecursion(arr , target , ++index);
    }
}
