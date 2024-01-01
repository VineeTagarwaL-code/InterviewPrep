package Array.leftRotateByK;

import java.util.Arrays;

public class Better {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        rotateByK(arr , arr.length , 2);
        System.out.println(Arrays.toString(arr));

    }
    static public void rotateByK(int[] arr , int size, int k ){
        reverseMEBABY(arr , 0 , size-k-1);
        reverseMEBABY(arr , size-k, size-1);

       reverseMEBABY(arr , 0 , size-1);
    }

    static public void reverseMEBABY(int[] arr , int start , int end){
        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
