package Array.DuplicateElement;

import java.util.HashSet;

public class Optimal {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,2,3,3};
        HashSet<Integer> k = removeDup(arr);
        System.out.println("The array after removing duplicate elements is ");
       for(int n : k ){
        System.out.println(n);
       }
    }
    
   public static HashSet<Integer> removeDup(int[] arr){

        HashSet<Integer> set = new HashSet<>();
        for( int i = 0 ; i < arr.length ; i++){
            if(!set.contains(arr[i])){
                set.add(arr[i]);
            }
        }
        return set;
    }
    static int removeDuplicates(int[] arr){
        int i =0 ;
        for(int j = 1 ; j < arr.length ; j++){
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i;
    }


}
