package Array.majorityElement3;

import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class brute {

    public static List<Integer> brute(int[] arr){
        int n = 0;
        List<Integer> ls = new ArrayList<>();
        for(int i = 0 ;i < arr.length ; i++){
            if(ls.size() == 0 || ls.get(0) != arr[i]){
                int cnt = 0 ;
                for(int j = 0 ; j <  arr.length ; j++){
                    if(arr[i] == arr[j]){
                        cnt++;
                    }
                }
                if(cnt > (arr.length/3)){
                    ls.add(arr[i]);
                }
            }
            if(ls.size() == 2){
                break;
            }
        }
        return ls;
    }

    public static void main(String args[]) {
        int[] arr = {11, 33, 33, 11, 33, 11};
        List<Integer> ans = brute(arr);
        System.out.print("The majority elements are: ");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }
}
