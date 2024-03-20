package Array.twiceApprearance;
import java.util.*;
public class better {
    public static void main(String[] args){
        int[] arr = {1,2,2};
        System.out.println(better(arr));
    }

    public static int better(int[] arr){
        int n = arr.length;

        HashMap<Integer , Integer> Hmap = new HashMap<>();
        for (int i  = 0 ; i < n ; i++){
            int val = Hmap.getOrDefault(arr[i], 0);
            Hmap.put(arr[i] , val+1);
        }

        for(Map.Entry<Integer,Integer> it : Hmap.entrySet()){
            if(it.getValue() == 1){
                return it.getKey();
            }
        }
   return -1;
    }

    
}
