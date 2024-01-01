package Array.leftRotateByK;

import java.util.Arrays;

public class Brute {
    public static void main(String args[]) {
        int n = 7;
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 2;
rotateLeftByK(arr , arr.length , 2);
        System.out.println("After Rotating the elements to right ");
        System.out.println(Arrays.toString(arr));


    }


 public static void rotateLeftByK(int[] arr , int size , int k ){
        k = k%size;
        int[] temp = new int[k];

        for(int i =  0 ; i < k ; i++){
            temp[i] = arr[i];
        }

        for(int i = k ; i < size ; i++){
            arr[i-k] = arr[i];
        }

        for(int i = size-k ; i < size ;i++){
          arr[i] = temp[i- (size-k)];
        }
 }
}
