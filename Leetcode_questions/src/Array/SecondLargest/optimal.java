package Array.SecondLargest;

import java.lang.reflect.Array;
import java.util.Arrays;



public class optimal {

    public static void main(String[] args) {
        int[] arr = {1,2,4,7,7,5};

        System.out.println(Arrays.toString(secondLargest(arr , arr.length)));
    }

public static int[] secondLargest(int[] arr , int n ){
      int largest=Integer.MIN_VALUE;
    int secondLargest=Integer.MIN_VALUE;
      int smallest = Integer.MAX_VALUE;
    int secondSmallest = Integer.MAX_VALUE;
        if(arr.length == 1){
            return new int[]{-1};
        }


        for(int i = 0 ; i < arr.length ;i++){
          largest = Math.max(largest , arr[i]);
          smallest = Math.min(smallest , arr[i]);
        }

        for(int i = 0 ; i < n ; i++){
            if(arr[i]<secondSmallest && arr[i] != smallest){
                secondSmallest = arr[i];

            }
            if(arr[i]>secondLargest && arr[i] != largest){
                secondLargest = arr[i];

            }
        }

        return new int[]{secondLargest , secondSmallest};

}
//works when there is no duplicates are there
public static int secondLargestElement (int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-2];

    }


}
