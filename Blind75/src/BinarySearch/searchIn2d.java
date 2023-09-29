package BinarySearch;

public class searchIn2d {

    public static void main(String[] args) {
        int[][] arr = {{1,3,5,7},{10,11,16,20} , {23,30,34,60}};
        System.out.println(searchMatrix(arr , 3));
    }

    static  public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0 ){
            return false;
        }

        int n = matrix.length ;
        int m = matrix[0].length;
        int low = 0 ;
        int high = (n*m)-1;

        while(low <= high){
            int mid = low + (high-low)/2;
            int row = mid / m;
            int col = mid % m;
            if(matrix[row][col]== target){
                return true;
            }
            else if(matrix[row][col] < target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }

        return false;
    }
}
