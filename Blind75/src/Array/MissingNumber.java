package Array;
//Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
public class MissingNumber {

    public static void main(String[] args) {
     int[] arr = {1,2,3,4,5,7};
     System.out.println(missingNumberAP3(arr , 7));
    }

  static  int missingNumber(int[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] != i){
                return i;
            }
        }
        return -1;
    }
    static  int missingNumberAP1(int[] arr , int n ){
        int sum = (n * (n +1)) /2;
        System.out.println(sum);
        int sum2=0;
        for(int i = 0 ; i < arr.length ; i++){
           sum2 += arr[i];
        }
        return sum-sum2;
    }

  static int missingNumberAP3(int[] arr){
        int i = 0 ;
        while(i < arr.length){
            int correctIndex = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correctIndex]){
                swap(arr , i , correctIndex);
            }else {
                i++;
            }
        }

        for(int j = 0 ; j < arr.length ; j++){
            if(arr[j] != j){
                return j;
            }
        }
       return arr.length;
  }

    static void swap(int nums[] , int first , int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

//most optimal solution
    static int missingNumberAP3(int[] arr , int n  ){
        int xor1 = 0  , xor2=0;
        for(int i = 0 ; i < arr.length ; i++){

            xor2 = xor2 ^ arr[i];
            xor1 = xor1 ^(i+1);
        }
        xor1 = xor1 ^ n;
        return xor1 ^ xor2;
    }
}
