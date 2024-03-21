package Array.sort120s;

import java.util.ArrayList;
import java.util.Arrays;

public class brute {
    public static void main(String[] args){
        int n = 6;
        int[] arr = {0,2,1,2,2,1,0};
        brute(arr , arr.length);
        System.out.println(Arrays.toString(arr));
;    }

    public static void brute(int[] arr , int len){
        for(int i = 0 ; i < len ; i++){
            for(int j = 0 ; j < len-i-1 ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j]  = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
