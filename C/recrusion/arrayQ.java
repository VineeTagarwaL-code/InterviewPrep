import java.util.*;

class arrayQ{
    public static void main(String[] args) {
        int[] arr = {1, 2 ,2,2 ,3};
        linearSearhMO(arr, 2, 0);
           System.out.println(indexes);
        // ArrayList<Integer> result = linearSearhMO(arr, 2, 0);
        // System.out.println(result);
      //  System.out.println(isSorted(arr, 0));
        //  System.out.println(linearSearch(arr, -1 , 0));
    }


    //checking if sorted with recursion 
    static boolean isSorted(int[] arr , int start){
         
       if(start == arr.length-1){
        return true;
       }
         return arr[start] < arr[start+1] && isSorted(arr, start+1);
    }


   static ArrayList<Integer> indexes = new ArrayList<Integer>();

    static void linearSearhMO(int[] arr , int data , int index){
        
        if(arr[index] == data){ 
           indexes.add(index+1);
        }

        if(index == arr.length-1){
            return ;
        }
        linearSearhMO(arr, data, index+1);

        
    }
    //linearSearch with recursion 
    static int linearSearch(int[] arr , int data , int index){
     if(arr[index] == data){
        return index+1;
     }

     if(index == arr.length-1){
        return -1;
     }

     return linearSearch(arr, data, index+1);
    }
}