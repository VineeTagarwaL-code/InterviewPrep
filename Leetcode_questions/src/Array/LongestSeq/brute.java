package Array.LongestSeq;

public class optima {
  public static void main(String args[]){
    int[] arr = {100,5,200,1,2,3,4};
    System.out.println(longestSeq(arr));
  } 
  
  public static int longestSeq(int[] arr){
    int size = arr.length;
    int maxCount = Integer.MIN_VALUE;
    int count = 1;
    for(int i = 0 ; i < size ; i++){
        int x = arr[i];
        int cnt = 1;
        //search for consecutive numbers
        //using linear search:
        while (linearSearch(arr, x + 1) == true) {
            x += 1;
            cnt += 1;
        }

        maxCount = Math.max(maxCount, cnt);

    }
    return maxCount;
  }

  public static boolean linearSearch(int []a, int num) {
    int n = a.length; //size of array
    for (int i = 0; i < n; i++) {
        if (a[i] == num)
            return true;
    }
    return false;
}
}
