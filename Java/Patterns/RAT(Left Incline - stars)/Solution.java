import java.util.Scanner;
// For an input n = 5 
// Print the RAT - left incline Pattern using '*'.
//  *
//  *  *
//  *  *  *
//  *  *  *  *
//  *  *  *  *  *
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int t = sc.nextInt();
        while (t >= 1){
            int n = sc.nextInt();
            
            // Outer Loop -> Rows
            for(int i = 0; i<n; i++){
                // Inner Loop -> Columns
                for(int j = 0; j<=i; j++){
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
