package Array.ContainsDuplicate;

import java.util.Arrays;

public class Better {

    public static void main(String[] args) {
        int[] nums = {1,2,2,5 , 10 ,2};
        boolean result = betterSolution(nums);
        System.out.println(Arrays.toString(nums)  +" " + result);
    }




    public static boolean betterSolution(int[] nums){
        sort(nums);
        for (int i = 0 ; i < nums.length ; i++){
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }


    public static void sort(int[] nums){
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = 0 ; j < nums.length - i -1 ; j++){
                   if(nums[j] > nums[j+1]){
                    int temp= nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1] = temp;
                   }
            }
        }
    }

//     public static void sortTheArray(int[] nums){
//     // if you are seeing this , konsa sorting lagau ? write in chat box
//    // going with bubble sort , no one replied xd

//         for(int i =0 ; i< nums.length ; i++){
//             for(int j = 0 ;  j < nums.length -1- i ; j++ ){
//                 // -i is for optimization
//                 if(nums[j] > nums[j+1] ){
//                     int temp =nums[j];
//                     nums[j]  = nums[j+1];
//                     nums[j+1] = temp;
//                 }
//             }
//         }

//     }

//     public static boolean better(int[] nums){
//       sortTheArray(nums);
//       for(int  i = 0 ; i < nums.length-1 ; i++){
//           if(nums[i] == nums[i+1]){
//               return true;
//           }
//       }
//       return false;
//     }



}
