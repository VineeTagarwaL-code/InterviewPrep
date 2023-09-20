import java.util.Arrays;

public class Recursion_5 {
    public static void main(String[] args) {
        int[] arr = {5,3,2,4,1};
        sort(arr , 0 , 4);
        System.out.println(Arrays.toString(arr));
    }
     

    static void sort(int[] arr , int low , int high){
        if(low >= high){
            return ;
        }

        int s = low ;
        int e = high;
        int mid = s + (e-s)/2;
  
     int pivot = arr[mid];
      
        while(s <= e){
            while(arr[s]  < pivot){
                s++;
            }

            while(arr[e] > pivot){
                e--;
            }

            if(s <= e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }


        }
       sort(arr , low , e);
       sort(arr , s , high);
    }



    static void quickSort(int[] arr){
        int start , end;
        start= 0;
        end = arr.length-1;
        int pivot = 1;
       while(start != end){
          if(arr[start] > arr[pivot] || arr[end] < arr[pivot]){
            int temp = arr[start];
            arr[start]  = arr[end];
            arr[end] = temp;
          }
          start++;
          end--;
       }
       return;
    }
}
