package Sorting_Algo;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {4,5,3,2,1};

        BubbleSort BS =  new BubbleSort();
        //BS.BubbleSort(arr  ); // [1, 2, 3, 4, 5]
        SelectionSort SS = new SelectionSort();
       // SS.selection(arr);  // [1, 2, 3, 4, 5]
      //  System.out.println(Arrays.toString(arr));

        InsertionSort IS = new InsertionSort();
      //  IS.InsertionSort(arr);
     //   System.out.println(Arrays.toString(arr));

        CyclicSort CS = new CyclicSort();
//        CS.cycleSort(arr);
//        System.out.println(Arrays.toString(arr));

        QuickSort QS = new QuickSort();
        QS.sort(arr , 0 , arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
