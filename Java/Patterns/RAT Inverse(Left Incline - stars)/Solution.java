import java.util.Scanner;
// For an input n = 5 
// Print the RAT - left incline Pattern using '*'.
//  * * * * * 
//  * * * *
//  * * *
//  * * 
//  * 

// NOTE - We can do this by either reversing the outer loop 
//        or changing the logic of inner loop to -> j<n-i+1
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int t = sc.nextInt();
        while (t >= 1){
            int n = sc.nextInt();
            
            // Outer Loop -> Rows
            for(int i = n; i>=1; i--){
                // Inner Loop -> Columns
                for(int j = 1; j<=i; j++){
                    System.out.print("*" + " ");
                }
                System.out.println();
            }
            t--;
            System.out.println();
        } 
        sc.close();  
    }
}
