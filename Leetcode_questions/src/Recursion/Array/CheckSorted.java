package Recursion.Array;

public class CheckSorted {
    public static void main(String[] args) {
        int[] arr = {1,-1,5,4};
        System.out.println(isSortedOPT(arr , 0 ));
    }
    public static boolean isSorted(int[] arr , int index) {
        if (index < arr.length - 1) {
            if (arr[index] > arr[index + 1]) {
                return false;
            }
            return isSorted(arr, index + 1);
        }
        return true;
    }

    public static boolean isSortedOPT(int[] arr , int index) {
      if(index == arr.length-1){
          return true;
      }
      return arr[index]<arr[index+1] && isSortedOPT(arr, index+1);
    }

}
