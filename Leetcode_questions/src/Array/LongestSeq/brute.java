package Array.LongestSeq;

public class brute {
  public static void main(String args[]){
    int[] arr = {0,3,7,2,5,8,4,6,0,1};
    System.out.println(longestSeq(arr));
  } 
  
  public static int longestSeq(int[] arr){
    int size = arr.length;
    int maxCount = Integer.MIN_VALUE;
    System.out.println(maxCount);

    for(int i = 0 ; i < size ; i++){
        int x = arr[i];
        int cnt = 1;
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
