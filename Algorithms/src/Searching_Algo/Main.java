package Searching_Algo;

public class Main {
    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        LinearSearch ls = new LinearSearch();
        InterpolationSearch is = new InterpolationSearch();
        int[] arr = {1,2,3,4,5,6};

        //  ---------------
        // | linaer Search |
        //  ---------------
        System.out.println(ls.linear(arr , 5)); //4
        System.out.println(ls.linearRecursion(arr , 5 , 0)); //4

        //  ---------------
        // | Binary Search |
        //  ---------------
        System.out.println(bs.BinarySearch(arr , 5));  // 4
        System.out.println(bs.BinarySearchRecursion(arr , 5 , 0 , arr.length-1)); //4

        //  ----------------------
        // | Interpolation Search |
        //  ---------------------
        System.out.println(is.interpolationSearch(arr , 0 ,  arr.length-1 , 5));  // 4
    }
}
