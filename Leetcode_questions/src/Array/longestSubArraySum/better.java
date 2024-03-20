package Array.longestSubArraySum;

public class better {
    public static void main(String[] args){
        int[] arr= {2,3,5};
        System.out.println(better(arr , arr.length , 5));
            }
         
        
            public static int better(int[] arr , int len , int k ){
                int lenL = 0;
                for(int i = 0 ; i < len ; i++){
                    long sum = 0 ;
                    for(int j = 0 ; j < len ; j++){
   
                        sum+= arr[j];
                     if(sum == k){
                        lenL = Math.max(lenL , j-i+1);
                     }
                    }
                }
                return lenL;
            }
}
