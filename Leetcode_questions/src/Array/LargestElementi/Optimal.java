package Array.LargestElementi;
import java.util.*;
public class Optimal {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};

        System.out.println(largestElement(arr));
    }

    public static int largestElement (int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];

    }
}
