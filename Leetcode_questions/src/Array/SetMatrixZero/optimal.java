package Array.SetMatrixZero;

import java.util.Arrays;

public class optimal {


    static int[][] zeroMatrix(int[][] matrix , int n , int m){
        int col0=1;
        for(int i =0 ; i < n ;i++){
            for(int j = 0 ; j < m ;j++){
                if(matrix[i][j] == 0){

                    matrix[i][0] = 0;
                    if(j!=0)
                        matrix[0][j] = 0;
                    else
                        col0 = 0;
                }
            }
        }
        for(int i =1 ; i < n ;i++){
            for(int j = 1 ; j < m ;j++){
              if(matrix[i][j] != 0){
                  if (matrix[0][j] == 0 || matrix[i][0] == 0) {
                      matrix[i][j] = 0;
                  }
              }
            }
        }

        if(matrix[0][0]==0 ){
            for(int j = 0 ; j<m ;j++){
                matrix[0][j]=0;
            }
        }
        if(col0==0 ){
            for(int j = 0 ; j<m ;j++){
                matrix[j][0]=0;
            }
        }
        return matrix;
    }

    static void print(int[][] matrix){

        for(int i = 0 ; i < matrix.length ;i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    public static void main(String[] args) {
        int[][] matrix ={{1,1,1} ,{1,0,1}, {1,1,1}};
//
//       print(matrix);
    int[][] matrix2 = zeroMatrix(matrix , 3,3);
      print(matrix2);
    }
}
