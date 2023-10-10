package Array;
import java.util.*;
public class UnionSorted {
    public static void main(String[] args) {

    }

    public int[] intersection(int[] nums1, int[] nums2) {
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
