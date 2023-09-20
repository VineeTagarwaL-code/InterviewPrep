// cieling of a number , using binary search 



public class first {
    public static void main(String[] args) {
        int arr[]={2,3,5,9,14,16,18};
         System.out.println(cieling1(arr , 4));
    } 

    static int cieling1(int arr[] , int target ){

        int low = 0 ;
        int high = arr.length-1;
         int mid = 0 ;
        while(low <= high){
             mid = low+(high-low)/2;
           if(arr[mid] == target ){
            return arr[mid];
           }
           if(arr[mid] > target){
            high = mid-1;
           }else{
            low=mid+1;
           }
           
        }
      return arr[low];
    }
}
