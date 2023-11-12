package BinarySearch;

public class kokoEatingBanana {

    public static void main(String[] args) {
        int[] arr = {3,6,7,11};
       System.out.println(minEatingSpeed(arr , 8));
    }
   static public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right=1;
        for(int pile : piles){
            right = Math.max(right , pile);
        }

        while(left < right){
            int mid = left + (right-left)/2;
            int hourSpent =0;

            for(int pile : piles){
                hourSpent += (int) Math.ceil((double)pile/mid);
            }
            if(hourSpent <= h){
                right = mid;
            }else{
                left=mid+1;
            }
        }
    return left;
    }
}
