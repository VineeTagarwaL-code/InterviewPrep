package Array.Missing;

public class optimal {


    public static void main(String[] args) {
        int[] array = {0, 1};
        System.out.println(missingNumber(array));
    }

    static int missingNumber(int[] nums) {
     int size = nums.length;
     int sum = (size * (size+1)) /2;
     for(int n : nums){
         sum -= n;
     }
     return sum;
    }
}
