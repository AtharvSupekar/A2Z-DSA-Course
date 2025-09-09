import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
Pascal's Triangle is a triangular array of binomial coefficients. Each number is the sum of the two numbers directly above it. The first row is 1, and every row starts and ends with 1.
There are three common variations of this problem:
    1. Find a specific element: Given a row r and column c, find the value at that position.
    2. Print a specific row: Given a row r, print all the elements in that row.
    3. Print the entire triangle: Given a number of rows n, print the entire triangle up to n rows.

    Find a specific element:
        TC = O(c)
        SC = O(1)
    Print a specific row:
        TC = O(n)
        SC = O(1)
    Print the entire triangle:
        TC = O(n*n)
        SC = O(1)
*/
public class Solution { 
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }   
    public static void printPascalsTriangle(List<List<Integer>> triangle) {
        if (triangle == null || triangle.isEmpty()) {
            System.out.println("[]");
            return;
        }

        // Find the maximum width of a number for proper alignment
        int maxWidth = 0;
        for (List<Integer> row : triangle) {
            for (Integer element : row) {
                maxWidth = Math.max(maxWidth, String.valueOf(element).length());
            }
        }

        // Print each row
        for (List<Integer> row : triangle) {
            // Optional: You can add padding to center the triangle
            // int padding = (maxWidth * triangle.size() - maxWidth * row.size()) / 2;
            // System.out.printf("%" + padding + "s", "");
            
            System.out.print('[');
            for (int j = 0; j < row.size(); j++) {
                // Use printf with a dynamic width specifier for alignment
                System.out.printf("%" + maxWidth + "d", row.get(j));
                if (j < row.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println(']');
        }
        System.out.println();
    }
    private static long pascalsTriangleNum(int n, int r) {
        n--;
        r--;
        long res = 1;
        for (int i = 0; i < r; i++) {
            res *= (n - i); 
            res /= (i + 1);
        }
        return res;
    }
    private static int[] pascalsTriangleRow(int n) {
        int[] res = new int[n];
        res[0] = 1;
        int num = 1;
        for (int i = 1; i < n; i++) {
            num *= (n - i);
            num /= i;
            res[i] = num;
        }
        return res;
    }
    private static List<Integer> generateRow(int rows) {
        List<Integer> row = new ArrayList<>();
        row.add(1);
        int num = 1;
        for (int i = 1; i < rows; i++) {
            num *= (rows - i);
            num /= i;
            row.add(num);
        }
        return row;
    }
    private static List<List<Integer>> pascalsTriangleWhole(int n) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            result.add(generateRow(i));
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int t = sc.nextInt();   
        while (t >= 1){ 
            t--;
            // // Variant 1:
            // int row = sc.nextInt();
            // int col = sc.nextInt();
            // System.out.println(pascalsTriangleNum(row, col));

            // // Variant 2:
            // int row = sc.nextInt();
            // int[] result = pascalsTriangleRow(row);
            // printArray(result);

            // Variant 3:
            int row = sc.nextInt();
            List<List<Integer>> result = pascalsTriangleWhole(row);
            printPascalsTriangle(result);
        }
        sc.close();
    }   
}