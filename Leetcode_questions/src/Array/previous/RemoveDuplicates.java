package Array.previous;

public class RemoveDuplicates {
    public static void main(String[] args) {
   int arr[] = {1,2,2,3,4,4,4,5};
   System.out.println(removeDuplicates(arr));
    }

    static  public int removeDuplicates(int[] nums) {
        int i = 0;
        for(int j = 1 ; j < nums.length ; j++){
            if(nums[j] != nums[i]){
                nums[i+1] = nums[j];
                i++;
            }
        }
        return i+1;
    }
}
