import java.util.Scanner;
// For an input n = 5 
// Print the RAT - left incline Pattern using numbers.
//  1
//  2 2
//  3 3 3
//  4 4 3 4
//  5 5 5 5 5
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int t = sc.nextInt();
        while (t >= 1){
            int n = sc.nextInt();
            
            // Outer Loop -> Rows
            for(int i = 1; i<=n; i++){
                // Inner Loop -> Columns
                for(int j = 1; j<=i; j++){
                    System.out.print(i + " ");
                }
                System.out.println();
            }
            t--;
            System.out.println();
        } 
        sc.close();  
    }
}
