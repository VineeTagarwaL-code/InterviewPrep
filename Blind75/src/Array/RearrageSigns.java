package Array;
//https://leetcode.com/problems/rearrange-array-elements-by-sign/
import java.util.*;
public class RearrageSigns {

    public static void main(String[] args) {
    int[] nums = {3,1,-2,-5,2,-4};

        System.out.println(Arrays.toString(rearrangeArrayOPT(nums)));
    }

   static public int[] rearrangeArray(int[] nums) {
        int size = nums.length;
     int[] pos = new int[size/2];
       int[] neg = new int[size/2];
       int[] result = new int[size];
       int m ,n;
       m=n=0;
       for(int i = 0 ; i < size ; i++){
           if(nums[i] >= 0){
               pos[m] = nums[i];
               m++;
           }else{
               neg[n]= nums[i];
               n++;
           }
       }

       for(int i = 0 ; i < size/2 ; i++){
           result[2*i] = pos[i];
           result[2*i+1] = neg[i];
       }

   return result;
    }

    static public int[] rearrangeArrayOPT(int[] nums) {
        int size = nums.length;

        int[] result = new int[size];
        int m ,n;
        m=0;
        n=1;
        for(int i = 0 ; i < size ; i++){
            if(nums[i] >= 0 && m <= size-1){
               result[m] = nums[i];
                m+=2;
            }else{
                result[n] = nums[i];
                n+=2;

            }
        }


        return result;
    }


}
