package utils;

public class MatrixUtils {
    /**
     * Prints a 2D integer matrix in a well-structured format.
     *
     * @param matrix The matrix to be printed.
     */
    public static void printMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            System.out.println("[]");
            return;
        }

        // Find the maximum width of a number for alignment
        int maxWidth = 0;
        for (int[] row : matrix) {
            for (int element : row) {
                maxWidth = Math.max(maxWidth, String.valueOf(element).length());
            }
        }

        for (int[] row : matrix) {
            System.out.print('[');
            for (int j = 0; j < row.length; j++) {
                System.out.printf("%" + maxWidth + "d", row[j]);
                if (j < row.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println(']');
        }
    }
}