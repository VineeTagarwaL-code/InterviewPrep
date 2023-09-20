import java.util.*;

class arrayQ {
   public static void main(String[] args) {
      int[] arr = { 4,3,2,1 };

      selection(arr, arr.length, 0,0);
      System.out.println(Arrays.toString(arr));
      // linearSearhMO(arr, 2, 0);
      // System.out.println(indexes);
      // ArrayList<Integer> result = linearSearhMO(arr, 2, 0);    
      // System.out.println(result);
      // System.out.println(isSorted(arr, 0));
      // System.out.println(linearSearch(arr, -1 , 0));

      // p1(4);
      // normalTriangle(4, 0);
   }

   // checking if sorted with recursion
   static boolean isSorted(int[] arr, int start) {

      if (start == arr.length - 1) {
         return true;
      }
      return arr[start] < arr[start + 1] && isSorted(arr, start + 1);
   }

   static ArrayList<Integer> indexes = new ArrayList<Integer>();

   static void linearSearhMO(int[] arr, int data, int index) {

      if (arr[index] == data) {
         indexes.add(index + 1);
      }

      if (index == arr.length - 1) {
         return;
      }
      linearSearhMO(arr, data, index + 1);

   }

   // linearSearch with recursion
   static int linearSearch(int[] arr, int data, int index) {
      if (arr[index] == data) {
         return index + 1;
      }

      if (index == arr.length - 1) {
         return -1;
      }

      return linearSearch(arr, data, index + 1);
   }

   //////////////////////////////////////////////////////////////////////////////////
   /* RECUSRION PRACTISE */

   static void p1(int n) {
      if (n < 0) {
         return;
      }
      for (int j = 0; j < n; j++) {
         System.out.print("* ");
      }
      System.out.println();
      p1(n - 1);
   }
   // not a proper recursive soltution at all n

   // solution : 2
   static void triangleP1(int r, int c) {
      if (r == 0) {
         return;
      }
      if (c < r) {
         System.out.print("* ");
         triangleP1(r, c + 1);
      } else {
         System.out.println();
         triangleP1(r - 1, 0);
      }
   }

   // normal triangle

   static void normalTriangle(int r, int c) {
      if (r == 0) {
         return;
      }
      if (c < r) {

     
         normalTriangle(r, c + 1);
             System.out.print("* ");
      } else {

       
         normalTriangle(r - 1, 0);
           System.out.println();
      }
   }


    static void bubble(int[] arr , int r, int c) {
      if (r == 0) {
         return;
      }
      if (c < r) {
        
         bubble(arr , r, c + 1);
      } else {
         
         bubble(arr , r - 1, 0);
      }
   }


   static void swap(int arr[] , int n , int m){
        int temp = arr[n];
                  arr[n] = arr[m];
          arr[n] = temp;

   }

      static void selection(int[] arr , int r, int c , int max) {
         if (r == 0) {
            return;
        }
        if (c < r) {
            if (arr[c] > arr[max]) {
                selection(arr, r, c+1, c);
            } else {
                selection(arr, r, c+1, max);
            }
        } else {
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;
            selection(arr, r-1, 0, 0);
        }
    }
   



   static void swapLargest(int arr[] , int l){
     int max = findLargest(arr, l);
     swap(arr , max , l);
   }


   static int findLargest(int arr[] ,int l){
      int index=0;
      int max = arr[0];
      for(int i = 0 ; i <= l ; i++){
         if(arr[i] > max){
            max = arr[i];
            index =1;
         }
      }
      return index;
   }
}
