package Array.majorityElement3;
import java.util.*;

public class better {
    public static List<Integer> better(int[] arr){
        int n = arr.length;
        List<Integer> ls = new ArrayList<>();

        HashMap<Integer , Integer> map = new HashMap<>();

        int mini = (int) (n/3)+1;

        for(int i = 0 ; i < n ;i++){
            int value = map.getOrDefault(arr[i], 0);
            map.put(arr[i] , value +1);


            if(map.get(arr[i]) == mini){
                ls.add(arr[i]);
            }

            if(ls.size() == 2)break;
        }
        return ls;
    }

    public static void main(String args[]) {
        int[] arr = {11, 33, 33, 11, 33, 11};
        List<Integer> ans = better(arr);
        System.out.print("The majority elements are: ");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }
}
