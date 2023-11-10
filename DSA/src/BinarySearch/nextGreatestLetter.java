package BinarySearch;

public class nextGreatestLetter {
    public static void main(String[] args) {
        char[] a = {'c','f','j'};
        System.out.println(nextGreatestLetter(a,'c'));
    }
   static public char nextGreatestLetter(char[] letters, char target) {
       int low = 0;
        int high = letters.length-1;
        while(low <= high){
        int mid = low+(high-low)/2;

        if(letters[mid] > target){
        high = mid-1;
        }else{
        low = mid+1;
        }
        }
        return letters[low % letters.length ];
    }
}
