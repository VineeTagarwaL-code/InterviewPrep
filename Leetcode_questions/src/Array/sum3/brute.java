package Array.sum3;
import java.util.*;
public class brute{

public static void main(String args[]){
   int[] arr = { -1, 0, 1, 2, -1, -4};
        int n = arr.length;
        List<List<Integer>> ans = brute(arr);
        for (List<Integer> it : ans) {
            System.out.print("[");
            for (Integer i : it) {
                System.out.print(i + " ");
            }
            System.out.print("] ");
        }
        System.out.println();
  }


  public static List<List<Integer>> brute(int[] arr){
        Set<List<Integer>> st = new HashSet<>();

    for(int i =0 ;i < arr.length ; i++){
      for(int j = i+1 ;j < arr.length ; j++){
    for(int k=  j+1;k < arr.length ; k++){
            if(arr[i] + arr[j] + arr[k] == 0 ){
          List<Integer> ls = Arrays.asList(arr[i] , arr[j] , arr[k]);
           ls.sort(null);
            st.add(ls);

          }
        }
    }
    }
    List<List<Integer>> ls = new ArrayList<>(st);
    return ls;
   }
}
