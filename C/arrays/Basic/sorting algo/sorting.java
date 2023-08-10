
import java.util.*;
class sorting {
    public static void main(String[] args) {
        int a[] = {5,4,3,2,1};
        
  
        int bubble[]  = selection(a);
        System.out.print(Arrays.toString(bubble));
    }
    
    static int[] bubble(int a[]){
              for(int i = 0 ; i< a.length ; i++){
            for(int j = 1 ; j<a.length-i ;j++){
                if(a[j] < a[j-1]){
                    int temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
                }
            }
        }
        return a;
    }
    
    
    static void swap(int[] arr , int first , int second){
         int temp = arr[first];
                    arr[first] = arr[second];
                   arr[second] = temp;
    }
    static int[] selection (int[] arr){
        for(int i = 0 ; i < arr.length ;i++){
            int last = arr.length-i-1;
            int max = getMaxIndex(arr , 0 ,last);
            swap(arr , max , last);
        }
        return arr;
    }
    
    static int getMaxIndex(int[] arr , int start  , int  end){
        int max = start;
        for(int i = start ; i <= end ; i++ ){
            if(arr[max ] < arr[i]){
                max = i;
            }
        }
        return max;
        
    }
}