package Array.majorityElement;
import java.util.*;
public class better {
    public static void main(String[] args) {
        int[] nums= {2,2,3,1,2,2};
        System.out.println(better(nums));
    }

    public static int better(int[] nums ){
        int len = nums.length;
        HashMap<Integer , Integer> hmap = new HashMap<>();
        for(int i =  0 ; i < len ; i++){
             int value = hmap.getOrDefault(nums[i], 0);
             hmap.put(nums[i] , value+1);
        }

        for(Map.Entry<Integer,Integer> it : hmap.entrySet()){
            if(it.getValue() > (len/2)){
                return it.getKey();
            }
        }
        return -1;
    }
}
