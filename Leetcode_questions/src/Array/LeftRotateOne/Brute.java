package Array.LeftRotateOne;

import java.util.Arrays;

public class Brute {

    public static void main(String[] args) {
int[] arr= {1,2,3,4,5};
rotateByOne(arr);
System.out.println(Arrays.toString(arr));


    }
    static void rotateByOne(int[] arr ){
        int firstValue = arr[0];

        for(int i = 1 ; i < arr.length ; i++ ){

        arr[i-1] = arr[i];

        }
        arr[arr.length-1]= firstValue;

    }

}
