package Array.RotateMatrix90;

import java.util.Arrays;

public class optimal {


    static void rotate90(int[][] matrix, int n) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length / 2; j++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - 1 - j];
                matrix[i][matrix.length - 1 - j] = temp;
            }
        }

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
        rotate90(matrix , 3);
        print(matrix);
    }
}
