import java.util.Scanner;
// For an input n = 5 
// Print the RAT - left incline Pattern using alphabets.
// * * * * * * * * * * 
// * * * *     * * * * 
// * * *         * * * 
// * *             * * 
// *                 * 
// *                 * 
// * *             * * 
// * * *         * * * 
// * * * *     * * * * 
// * * * * * * * * * * 
// Approach -> [stars, space, stars]
// Line 1 -> [5,0,5]
// Line 2 -> [4,2,4]
// Line 3 -> [3,4,3]
// Line 4 -> [2,6,2]
// Line 5 -> [1,8,1]
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int t = sc.nextInt();
        while (t >= 1){
            int n = sc.nextInt();
            int iniS = 0;
            // Upper Half
            // Outer Loop -> Rows
            for(int i = 0; i<n; i++){
                // Inner Loop -> Columns
                // stars
                for(int j = 0; j<n-i; j++){
                    System.out.print("* ");
                }
                // spaces
                for(int j = 0; j<iniS; j++){
                    System.out.print("  ");
                }
                // stars
                for(int j = 0; j<n-i; j++){
                    System.out.print("* ");
                }
                iniS += 2;
                System.out.println();
            }
            // Lower Half
            // Outer Loop -> Rows
            iniS = 2*(n - 1);
            for(int i = 0; i<n; i++){
                // Inner Loop -> Columns
                // stars
                for(int j = 0; j<=i; j++){
                    System.out.print("* ");
                }
                // spaces
                for(int j = 0; j<iniS; j++){
                    System.out.print("  ");
                }
                // stars
                for(int j = 0; j<=i; j++){
                    System.out.print("* ");
                }
                iniS -= 2;
                System.out.println();
            }
            t--;
            System.out.println();
        } 
        sc.close();  
    }
}
