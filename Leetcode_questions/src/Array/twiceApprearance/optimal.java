package Array.twiceApprearance;

public class optimal {
    public static void main(String[] args){
        int[] arr = {1,2,2};
        System.out.println(optimal(arr));
    }

    public static int optimal(int[] arr){
        int n = arr.length;
int val=0;
        for(int i = 0 ; i < n ; i++){
            val =  arr[i]^val;
        }
        return val;
    }
}
