package Array.sort120s;

import java.util.*;

public class better {
        public static void main(String[] args){
        int n = 6;
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(new Integer[] {0,1,2,2,1,0}));
        int length = arr.size();
        better(arr , n );
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
  }

  public static void better(ArrayList<Integer> arr , int n ){
    int cnt_1 = 0 , cnt_2 =0 , cnt_0 = 0;
    for(int i = 0 ; i < arr.size() ; i++){
        if(arr.get(i) == 0 ){
            cnt_0++;
        }else if(arr.get(i)== 1){
            cnt_1++;
        }else{
            cnt_2++;
        }
    }

    for (int i = 0; i < cnt_0; i++) arr.set(i, 0); // replacing 0's

    for (int i = cnt_0; i < cnt_0 + cnt_1; i++) arr.set(i, 1); // replacing 1's

    for (int i = cnt_0 + cnt_1; i < n; i++) arr.set(i, 2); // replacing 2's
  }
}
