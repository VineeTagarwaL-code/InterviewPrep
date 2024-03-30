package Array.SpiralMatrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralMatrix {
    public static void main(String args[]) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        List<Integer> list = spiralOrder(matrix);

    }

    static void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    public static List<Integer> spiralOrder(int[][] mat) {
        int n = mat.length; // no. of rows
        int m = mat[0].length; // no. of columns
        List<Integer> list = new ArrayList<>();

        // Initialize the pointers required for traversal.
        int top = 0, left = 0, bottom = n - 1, right = m - 1;
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                list.add(mat[top][i]);

            }
            top++;

            for (int i = top; i <= bottom; i++) {
                list.add(mat[i][right]);

            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    list.add(mat[bottom][i]);

                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    list.add(mat[i][left]);

                }
                left++;
            }
        }
        return list;
    }

}