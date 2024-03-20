package Array.longestSubArraySum;

public class brute {
    public static void main(String[] args){
int[] arr= {2,3,5};
System.out.println(brute(arr , arr.length , 5));
    }
 

    public static int brute(int[] arr , int len , int k ){
        int lenL = 0;
        for(int i = 0 ; i < len ; i++){
            for(int j = 0 ; j < len ; j++){
             long sum = 0 ;
             for(int K = i ; K <= j ; K++){
                sum += arr[K];
             }

             if(sum == k){
                lenL = Math.max(lenL , j-i+1);
             }
            }
        }
        return lenL;
    }

    // public static int brute(int[] arr , int len , int k ){
    //     int count=0;
    //     int sum = 0;
    //     for(int i = 0 ; i < len ; i++){
    //         sum+= arr[i];
    //         count++;
    //         if(sum == k){
    //             return count;
    //         }
    //     }
    //     return -1;
    // }
}
