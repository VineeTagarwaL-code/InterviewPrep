package Array.sum4;
import java.util.*;
public class better {

    public static void main(String[] args) {
        int[] nums = {4, 3, 3, 4, 4, 2, 1, 2, 1, 1};
        int target = 9;
        List<List<Integer>> ans = fourSum(nums, target);
        System.out.println("The quadruplets are: ");
        for (List<Integer> it : ans) {
            System.out.print("[");
            for (Integer ele : it) {
                System.out.print(ele + " ");
            }
            System.out.print("] ");
        }
        System.out.println();
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length; // size of the array
           Set<List<Integer>> st = new HashSet<>();
   
           // checking all possible quadruplets:
           for (int i = 0; i < n; i++) {
               for (int j = i + 1; j < n; j++) {
                   Set<Long> hashset = new HashSet<>();
                   for (int k = j + 1; k < n; k++) {
                       // taking bigger data type
                       // to avoid integer overflow:
                       long sum = nums[i] + nums[j];
                       sum += nums[k];
                       long fourth = target - sum;
                       if (hashset.contains(fourth)) {
                           List<Integer> temp = new ArrayList<>();
                           temp.add(nums[i]);
                           temp.add(nums[j]);
                           temp.add(nums[k]);
                           temp.add((int) fourth);
                           temp.sort(Integer::compareTo);
                           st.add(temp);
                       }
                       // put the kth element into the hashset:
                       hashset.add((long) nums[k]);
                   }
               }
           }
           List<List<Integer>> ans = new ArrayList<>(st);
           return ans;
       }
}
