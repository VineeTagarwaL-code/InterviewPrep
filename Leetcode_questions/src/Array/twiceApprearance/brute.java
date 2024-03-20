package Array.twiceApprearance;

import javax.swing.Spring;

public class brute {
    public static void main(String[] args){
        int[] arr = {1,2,2};
        System.out.println(brute(arr));
    }

    public static int brute(int[] arr){
       int length = arr.length;
       for(int i = 0  ; i < length ; i++){
        int num = arr[i];
        int cnt = 0;



        for(int j =0 ; j < length ; j++){
            if(arr[j] == num){
                cnt++;
            }
        }

        if(cnt == 1) return num;
       }
     return -1;
    }
}
