import java.util.Scanner;
// For an input n = 5 
// Print the Inverse RAT - left incline Pattern using numbers.
//  1 2 3 4 5 
//  1 2 3 4
//  1 2 3
//  1 2 
//  1

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int t = sc.nextInt();
        while (t >= 1){
            int n = sc.nextInt();
            
            // Outer Loop -> Rows
            for(int i = 1; i<=n; i++){
                // Inner Loop -> Columns
                for(int j = 1; j<=n-i+1; j++){
                    System.out.print(j + " ");
                }
                System.out.println();
            }
            t--;
            System.out.println();
        } 
        sc.close();  
    }
}
