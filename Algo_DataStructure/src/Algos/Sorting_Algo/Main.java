package Algos.Sorting_Algo;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};

        BubbleSort BS =  new BubbleSort();
        BS.BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
