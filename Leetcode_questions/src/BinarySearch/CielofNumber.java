package BinarySearch;

public class CielofNumber {
    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int ans = cielingOfn(arr, target);
        System.out.println(ans);
    }

    static int cielingOfn(int[] n , int target){
        if (target > n[n.length - 1]) {
            return -1;
        }


          int start= 0;
          int end = n.length-1;

          while(start <= end){
             int mid = start+(end-start)/2;
              if(n[mid] == target){
                  return mid;
              }
              if(n[mid] > target ){
                  end = mid-1;
              }else{
                  start = mid+1;
              }
          }
          return start;
    }

}
