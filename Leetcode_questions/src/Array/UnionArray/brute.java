package Array.UnionArray;
import java.util.*;
public class brute {


    public static void main(String args[]) {
//        int n = 10, m = 7;
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arr2[] = {2, 3, 4, 4, 5, 11, 12};

        System.out.println(Arrays.toString(unionSorted(arr1 , arr2)));

    }

    static public int[] unionSorted(int[] num1 , int[] num2){
        Set<Integer> result = new HashSet<>() ;

        for(int n : num1){
            result.add(n);
        }

        for(int n : num2){
            if(!result.contains(n)){
                result.add(n);
            }
        }

        int[] resultarr = new int[result.size()];
        int index = 0;
        for(int n : result){
            resultarr[index++]  = n;

        }
        Arrays.sort(resultarr);
        return resultarr;
    }
}
