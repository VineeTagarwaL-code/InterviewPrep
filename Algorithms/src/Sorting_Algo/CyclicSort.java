package Sorting_Algo;

public class CyclicSort {
    public void cycleSort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i]-1;
            if(arr[correctIndex] != arr[i]){
                int temp = arr[correctIndex];
                arr[correctIndex] = arr[i];
                arr[i] = temp;
            }else{
                i++;
            }
        }
    }

}
