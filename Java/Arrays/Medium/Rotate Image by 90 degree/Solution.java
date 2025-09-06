import java.util.Scanner;
/*
    Brute Force Approach -
    TC = O(n^2) or O((n * (n + 1)) / 2)
    SC = O(n) - Worst Case (If array is sorted in descending order)

    Optimal Approach -
    TC = O(n)
    SC = O(n) - Worst Case (If array is sorted in descending order)
*/
public class Solution {
    private static void printMatrix(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        System.out.println("Read matrix of size " + rows + "x" + cols + ":");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
    }
    private static void markRow(int i, int cols, int[][] matrix) {
        for (int j = 0; j < cols; j++) {
            if (matrix[i][j] != 0) {
                matrix[i][j] = Integer.MIN_VALUE;
            }
        }
    }
    private static void markCol(int j, int rows, int[][] matrix) {
        for (int i = 0; i < rows; i++) {
            if (matrix[i][j] != 0) {
                matrix[i][j] = Integer.MIN_VALUE;
            }
        }
    }
    private static void setZeroesBF(int[][] mat, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mat[i][j] == 0) {
                    markRow(i, cols, mat);
                    markCol(j, rows, mat);
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mat[i][j] == Integer.MIN_VALUE) {
                    mat[i][j] = 0;
                }
            }
        }
    }
    private static void setZeroesBetter(int[][] mat, int rows, int cols) {
        int[] rowToZero = new int[rows];
        int[] colToZero = new int[cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mat[i][j] == 0) {
                    rowToZero[i] = 1;
                    colToZero[j] = 1;
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (rowToZero[i] == 1 || colToZero[j] == 1) {
                    mat[i][j] = 0;
                }
            }
        }
    }
    private static void setZeroesOP(int[][] mat, int rows, int cols) {
        int col0 = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mat[i][j] == 0) {
                    mat[i][0] = 0;
                    if (j != 0)
                        mat[0][j] = 0;
                    else 
                        col0 = 0;
                }
            }
        }
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (mat[0][j] == 0 || mat[i][0] == 0) {
                    mat[i][j] = 0;
                }
            }
        }
        if (mat[0][0] == 0) {
            for (int j = 0; j < cols; j++)
                mat[0][j] = 0;
        }
        if (col0 == 0) {
            for (int i = 0; i < rows; i++)
                mat[i][0] = 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int t = sc.nextInt();   
        while (t >= 1){ 
            t--;
            int rows = sc.nextInt();
            int cols = sc.nextInt();
            int[][] matrix = new int[rows][cols];

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
            // setZeroesBF(matrix, rows, cols);
            // printMatrix(matrix);
            // setZeroesBetter(matrix, rows, cols);
            // printMatrix(matrix);
            setZeroesOP(matrix, rows, cols);
            printMatrix(matrix);
        }
        sc.close();
    }   
}