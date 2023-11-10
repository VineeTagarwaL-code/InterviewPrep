package Array.RotateMatrix90;

import java.util.Arrays;

//https://takeuforward.org/data-structure/rotate-image-by-90-degree/
public class Brute {

    static int[][] rotate90(int[][] matrix , int n ){
        int[][] resultMatrix = new int[n][n];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                 resultMatrix[j][n-1-i] = matrix[i][j];
            }
        }
        return resultMatrix;
    }
    static void print(int[][] matrix){
        for(int i = 0 ; i < matrix.length ;i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
    public static void main(String[] args) {
        int[][] matrix ={{1,2,3} ,{4,5,6}, {7,8,9}};
        print(matrix);
        System.out.println();
        int[][] resultMatrix = rotate90(matrix , 3);
        print(resultMatrix);
    }
}
