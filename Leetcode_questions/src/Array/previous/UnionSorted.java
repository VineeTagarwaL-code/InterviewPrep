package Array.previous;
import java.util.*;
public class UnionSorted {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arr2[] = {2, 3, 4, 4, 5, 11, 12};
        System.out.println(Arrays.toString(intersection(arr1 , arr2)));
    }

    static public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        for(int num : nums1){
            set1.add(num);
        }


        for(int num : nums2){
            if(set1.contains(num)){
                result.add(num);
            }

        }

        int[] result1 = new int[result.size()];
        int index = 0;
        for(int num : result){
            result1[index++]=num;
        }
        return result1;
    }
}
