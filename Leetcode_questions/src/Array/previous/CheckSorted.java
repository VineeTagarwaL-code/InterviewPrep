package Array.previous;
//
public class CheckSorted {
    public static void main(String[] args) {
     int[] arr = {1,2,1,3,4,5};
     System.out.println(isSorted(arr));
    }
//check if the array is sorted or not
    static boolean isSorted(int[] arr){
        int size = arr.length;
     for(int i = 0 ; i < size ; i++){
         if(arr[i] > arr[i+1])
         {
             return false;
         }

     }
     return true;
    }
}
