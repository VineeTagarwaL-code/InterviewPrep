package Recursion.Array;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,-1,5,4};
        System.out.println(linearSearch(arr , -1 , arr.length-1));
        System.out.println(linearSearchIndex(arr , -1 , arr.length-1));
        System.out.println(linearSearchIndexLast(arr , -1 , arr.length-1));
    }

    static boolean linearSearch(int[] arr , int target , int index){
        if(index == arr.length-1){
            return false;
        }
        return arr[index]==target || linearSearch(arr , target , index+1);
    }

    static int linearSearchIndex(int[] arr , int target , int index){
        if(index == arr.length-1){
            return -1;
        }
        if(arr[index]==target) {
            return index;
        }
        return linearSearchIndex(arr , target , index+1);
    }

    static int linearSearchIndexLast(int[] arr , int target , int index){
        if(index == 0){
            return -1;
        }
        if(arr[index]==target) {
            return index;
        }
        return linearSearchIndexLast(arr , target , index-1);
    }

}
