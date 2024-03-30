package Array.sum3;
import java.util.*;
public class better {
    public static void main(String args[]){
        int[] arr = { -1, 0, 1, 2, -1, -4};
        int n = arr.length;
        List<List<Integer>> ans = better(arr);
        for (List<Integer> it : ans) {
            System.out.print("[");
            for (Integer i : it) {
                System.out.print(i + " ");
            }
            System.out.print("] ");
        }
        System.out.println();
    }


    public static List<List<Integer>> better(int[] arr){
         Set<List<Integer>> st = new HashSet<>();
int n = arr.length;
         for(int i = 0 ; i < n ;i++){
            Set<Integer> s = new HashSet<>();
            for(int j = i+1 ; j < n ;j++){
                int x = -(arr[i] + arr[j]);

                if(s.contains(x)){
                    List<Integer> ls = Arrays.asList(x , arr[i] , arr[j]);
                    ls.sort(null);
                    st.add(ls);
                }

                s.add(arr[j]);
            }
         }

         List<List<Integer>> ls = new ArrayList<>(st);
         return ls;
    }
}
