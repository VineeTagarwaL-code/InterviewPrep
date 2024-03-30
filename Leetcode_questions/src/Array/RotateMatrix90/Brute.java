package Array.RotateMatrix90;

import java.util.Arrays;

//https://takeuforward.org/data-structure/rotate-image-by-90-degree/
public class Brute {
    static void print(int[][] matrix){
        for(int i = 0 ; i < matrix.length ;i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
    static void rotate90(int[][] matrix , int n ){
        int resultmat[][] = new int[matrix.length][matrix[0].length];
        for(int i =0 ; i < matrix.length ;i++){
            for(int j = 0 ; j < matrix[0].length ;j++){
                resultmat[j][matrix.length - 1 - i]= matrix[i][j];
            }
        }        print(resultmat);
        for(int i =0 ; i < matrix.length ;i++){
            for(int j = 0 ; j < matrix[0].length ;j++){
                matrix[i][j]= resultmat[i][j];
            }
        }  
    }

    public static void main(String[] args) {
        int[][] matrix ={{1,2,3} ,{4,5,6}, {7,8,9}};
        print(matrix);
        System.out.println();
        rotate90(matrix , 3);
        print(matrix);
    }
}
