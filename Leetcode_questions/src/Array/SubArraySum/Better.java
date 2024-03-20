package Array.SubArraySum;

public class Better {

    public static void main(String[] args) {
        int[] arr = {2,3,5};
        int k = 6;
        System.out.println(subarraySum(arr , 3));
    }


    public static int findAllSub(int[] arr , int k ){
        int n = arr.length;
        int cnt = 0 ;

        for(int i = 0 ; i < n ; i++){
            int sum = 0;
            for(int j = i ; j < n ; j++) {
                sum += arr[j];
                if(sum == k){
                    cnt++;
                }

            }

        }
        return cnt;
    }
   public static int subarraySum(int[] nums , int k ){
        return findAllSub(nums , k);
   }



}
