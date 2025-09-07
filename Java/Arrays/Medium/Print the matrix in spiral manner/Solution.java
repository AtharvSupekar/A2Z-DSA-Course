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
    
    private static int[][] printSpiralBF(int[][] mat, int rows, int cols, boolean ACW) {
        return mat;
    }
    private static int[][] printSpiralOP(int[][] mat, int rows, int cols, boolean ACW) {
        return mat;
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
            int[][] resultBF = printSpiralBF(matrix, rows, cols, true);
            printMatrix(resultBF);
            int[][] resultOP = printSpiralOP(matrix, cols, rows, true);
            printMatrix(resultOP);
        }
        sc.close();
    }   
}