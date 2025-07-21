import java.util.Scanner;
/*
 * For an input n = 5 
 * Print the Solid Square Pattern using '*'.
    * * * * * 
    *       * 
    *       * 
    *       * 
    * * * * * 
 */
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int t = sc.nextInt();
        while (t >= 1){
            int n = sc.nextInt();
            
            // Outer Loop -> Rows
            for(int i = 1; i<=n; i++){
                // Inner Loop -> Columns
                for(int j = 1; j<=n; j++){
                    if (i == n || i == 1 || j == 1 || j == n){
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
            t--;
            System.out.println();
        } 
        sc.close();  
    }
}
