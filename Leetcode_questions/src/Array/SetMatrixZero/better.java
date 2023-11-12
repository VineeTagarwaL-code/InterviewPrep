package Array.SetMatrixZero;

import java.util.ArrayList;
import java.util.Arrays;

public class better {
    public static   ArrayList<ArrayList<Integer>> zeroMatrix(  ArrayList<ArrayList<Integer>>  matrix , int n , int m){
        int[] row = new int[n];
        int[] col = new int[m];

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(matrix.get(i).get(j)==0){
                    row[i] = 1;
                    col[j]=1;
                }
            }
        }


        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
               if(row[i] ==1 || col[j]==1){
                   matrix.get(i).set(j,0);
               }
            }
        }
        return matrix;

    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 0, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));

        int n = matrix.size();
        int m = matrix.get(0).size();

        ArrayList<ArrayList<Integer>> ans = zeroMatrix(matrix, n, m);
       int[][] matrix1 = new int[3][2];
       System.out.println(matrix1.length + " " + matrix1[0].length);
        System.out.println("The Final matrix is: ");
        for (ArrayList<Integer> row : ans) {
            for (Integer ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
