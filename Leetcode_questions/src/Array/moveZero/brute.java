package Array.moveZero;

import java.util.Arrays;

public class brute {
    public static void main(String[] args) {
       int[] arr = {1,0,1,2,0,4};
       moreZero(arr);
       System.out.println(Arrays.toString(arr));
    }

    static public void moreZero(int[] arr){
        int j =-1;
        for(int i = 0; i < arr.length ; i++){
            if(arr[i] == 0){
                j=i;
                break;
            }
        }

        for(int i = j+1 ; i < arr.length ; i++){
            if(arr[i] != 0 ){
                int temp = arr[i];
                arr[i]= arr[j];
                arr[j]=temp;
                j++;
            }
        }
    }


}
