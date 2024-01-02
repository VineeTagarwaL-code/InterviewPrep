package Array.Missing;

public class brute {

    public static void main(String[] args) {
        int[] array = {0,1};
        System.out.println(missingNumber(array));
    }

    static int missingNumber(int[] nums){
        int i = 0;
        while(i < nums.length){
            int correct = nums[i];
            if(nums[i] < nums.length && nums[i] != nums[correct]){
                swap(nums , i , correct);
            }else{
                i++;
            }
        }
        for(int j = 0 ; j < nums.length ;j++){
            if(j != nums[j]){
                return j;
            }
        }

        return nums.length;

    }
    static void swap(int nums[] , int first , int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
