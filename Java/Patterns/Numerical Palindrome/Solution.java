import java.util.Scanner;
// For an input n = 5 
// Print the RAT - left incline Pattern using numbers.
// 1      1
// 12    21
// 123  321
// 12344321
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int t = sc.nextInt();
        while (t >= 1){
            int n = sc.nextInt();
            // Outer Loop -> Rows
            int space = 2*(n-1);
            for(int i = 1; i<=n; i++){
                // Inner Loop -> Columns
                // nums
                for(int j = 1; j<=i; j++){
                    System.out.print(j + " ");
                }
                //spaces
                for(int j = 1; j<=space; j++){
                    System.out.print("  "); 
                }
                // nums, but reversed
                for(int j = i; j>=1; j--){
                    System.out.print(j + " ");
                }
                System.out.println();
                space -= 2;
            }
            t--;
            System.out.println();
        } 
        sc.close();  
    }
}
