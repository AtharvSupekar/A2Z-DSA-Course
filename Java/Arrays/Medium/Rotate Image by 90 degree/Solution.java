import java.util.Scanner;
/*
    Brute Force Approach -
    TC = O(M * N)
    SC = O(M * N)

    Optimal Approach -
    TC = O(3(M * N)/4)    # M/2  * N/2(transpose) + MN/2(reverse)
    SC = O(1) if M == N else O(M * N)
*/
public class Solution {
    private static void printMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            System.out.println("[]");
            return;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;
        
        // Find the maximum width of a number for alignment
        int maxWidth = 0;
        for (int[] row : matrix) {
            for (int element : row) {
                maxWidth = Math.max(maxWidth, String.valueOf(element).length());
            }
        }

        for (int i = 0; i < rows; i++) {
            System.out.print('[');
            for (int j = 0; j < cols; j++) {
                // Use printf with a dynamic width specifier
                System.out.printf("%" + maxWidth + "d", matrix[i][j]);
                if (j < cols - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println(']');
        }
        System.out.println();
    }
    private static int[][] transpose(int[][] matrix, int rows, int cols) {
        if (rows == cols) {
            for (int i = 0; i < rows - 1; i++) {
                for (int j = i + 1; j < cols; j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
            return matrix;
        } else {
            int[][] tp = new int[cols][rows];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    tp[j][i] = matrix[i][j];
                }
            }
            return tp;
        }
        
    }
    private static int[][] rotateMatrixBF(int[][] mat, int rows, int cols, boolean ACW) {
        int[][] result = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (ACW){
                    result[cols - 1 - j][i] = mat[i][j];
                } else {
                    result[j][rows - 1 - i] = mat[i][j];
                }
                
            }
        }
        return result;
    }
    private static int[][] rotateMatrixOP(int[][] mat, int rows, int cols, boolean ACW) {
        // 1. Transpose
        int[][] tp = transpose(mat, rows, cols);
        int tpRows = tp.length, tpCols = tp[0].length;
        // 2. Reverse the rows / cols
        if (ACW) {
            for (int j = 0; j < tpCols; j++) {
                int left = 0, right = tpRows - 1;
                while (left < right) {
                    int temp = tp[left][j];
                    tp[left][j] = tp[right][j];
                    tp[right][j] = temp;
                    left++;
                    right--;
                }
            }
        } else {
            for (int i = 0; i < tpRows; i++) {
                int left = 0, right = tpCols - 1;
                while (left < right) {
                    int temp = tp[i][left];
                    tp[i][left] = tp[i][right];
                    tp[i][right] = temp;
                    left++;
                    right--;
                }
            }
        }
        return tp;
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
            // int[][] resultBF = rotateMatrixBF(matrix, rows, cols, false);
            // printMatrix(resultBF);
            int[][] part2 = rotateMatrixOP(matrix, rows, cols, true);
            int[][] resultOP = rotateMatrixOP(part2, cols, rows, true);
            printMatrix(resultOP);
        }
        sc.close();
    }   
}