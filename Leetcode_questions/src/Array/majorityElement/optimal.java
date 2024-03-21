package Array.majorityElement;

public class optimal {
    public static void main(String[] args) {
        int[] nums= {2,2,3,1,2,2};
        System.out.println(optimal(nums));
    }

    public static int optimal(int[] nums ){
       int cnt = 0 ;
       int el = nums[0];

       for(int i = 0 ; i < nums.length ;i++){
        if(cnt == 0 ){
            el = nums[i];
            cnt = 1;
        }else if (nums[i]== el){
            cnt++;
        }else{
            cnt--;
        }
       }

       int counTimes = 0;
       for(int i = 0 ; i < nums.length ;i++){
        if(nums[i] == el){
            counTimes++;
        }
       }

       if(counTimes > (nums.length /2)){
        return counTimes;
       }
       return -1;

    }
}
