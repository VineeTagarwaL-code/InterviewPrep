package BinarySearch;

public class MoutainPeak {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,1,0};
        System.out.println(MoutainPeak(arr));
    }
    static  public int MoutainPeak(int[] n) {
        int start= 0;
        int end = n.length-1;

        while(start < end){
            int mid = start+(end-start)/2;
            if(n[mid] > n[mid+1]){
                end = mid;
            }else{
                start = mid+1;
            }
        }
        return start;
    }


}
