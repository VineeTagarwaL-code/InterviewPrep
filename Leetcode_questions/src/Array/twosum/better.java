package Array.twosum;

import java.util.Arrays;
import java.util.HashMap;

public class better {
            public static void main(String[] args){
        int[] nums= {2,6,5,8,11};
        int len = nums.length;
        System.out.println(Arrays.toString(better(nums , len , 14)));
    }

    public static int[] better(int[] arr ,int len , int target){
        HashMap<Integer , Integer> hmap  = new HashMap<>();
        for(int i = 0 ; i<len  ;i++){
            int num = arr[i];
            int secondHalf= target-num;
            if(hmap.containsKey(secondHalf)){
                return new int[] {i , hmap.get(secondHalf)};
            }
            hmap.put(arr[i] , i );
        }
        return new int[]{-1,-1};
    }

}
