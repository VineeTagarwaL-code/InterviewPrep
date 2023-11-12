package Array;

public class CheckSorted {
    public static void main(String[] args) {
     int[] arr = {1,2,1,3,4,5};
     System.out.println(isSorted(arr));
    }

    static boolean isSorted(int[] arr){
        for(int i= 1 ; i < arr.length ; i++){
            if(arr[i] >= arr[i-1]){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }
}
