import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
    Optimal Approach -
    TC = O(M * N)
    SC = O(M * N) if list is returned 
       = O(1) if elements are directly printed
*/
public class Solution {
    private static void printArrayList(List<Integer> arr){
        for (int i = 0; i < arr.size(); i++){
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
        System.out.println();
    }
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

    private static List<Integer> printSpiral(int[][] matrix, int rows, int cols) {
        List<Integer> result = new ArrayList<Integer>();
        int top = 0, left = 0, bot = matrix.length - 1, right = matrix[0].length - 1;
        while (top <= bot && left <= right) {
            for (int i = left; i <= right; i++)
                result.add(matrix[top][i]);
            top++;
            for (int i = top; i <= bot; i++)
                result.add(matrix[i][right]);
            right--;
            if (top <= bot) {
                for (int i = right; i >= left; i--)
                    result.add(matrix[bot][i]);
                bot--;
            }
            if (left <= right) {
                for (int i = bot; i >= top; i--)
                    result.add(matrix[i][left]);
                left++;
            }
        }
        return result;
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
            List<Integer> result = printSpiral(matrix, cols, rows);
            printArrayList(result);
        }
        sc.close();
    }   
}