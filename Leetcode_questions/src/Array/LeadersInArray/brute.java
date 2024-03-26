package Array.LeadersInArray;

public class brute {
    public static void main(String args[]){
        int[] arr = {10, 22, 12, 3, 0, 6};
        learders(arr);
    }

    public static void learders(int[] arr){
        int size = arr.length;
        for(int i = 0 ; i < arr.length ; i++){
            boolean isLeader = true;
            for(int j = i+1; j < arr.length ; j++){
                if(arr[i] > arr[j]){
                  continue;  
                }else{
                    isLeader= false;
                }
            }
            if(isLeader){
                System.out.println(arr[i]);
            }
        }
    }
}
