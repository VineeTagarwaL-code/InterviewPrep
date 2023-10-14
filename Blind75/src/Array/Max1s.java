package Array;

public class Max1s {
    public static void main(String[] args) {
        int arr[] = {1,1,0,1,1,1};
        System.out.println(maxNumberof1s(arr));
    }

    static int maxNumberof1s(int[] nums){
        int maxCounter = 0;
        int counterFor1 = 0;
        for(int num : nums){
            if(num == 1){
                counterFor1++;
            }else{
                maxCounter = counterFor1;
                counterFor1=0;
            }
        }

        if(counterFor1 > maxCounter){
            return counterFor1;
        }
        return maxCounter;
    }

}
