package Array.ConsecutiveOnes;

public class brute {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 0, 1, 1, 1 };
        System.out.println(findout(arr));
    }

    public static int findout(int[] arr) {
        int count = 0 ;
        int maxCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
count++;
            }
else{
    count = 0 ;
}

         maxCount = Math.max(maxCount , count);

        }
        return maxCount;
    }

}
