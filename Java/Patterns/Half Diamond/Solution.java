import java.util.Scanner;
// For an input n = 5 
// Print the Half Diamond Pattern using '*'.
//  *
//  * *
//  * * *
//  * * * *
//  * * * * *
//  * * * *
//  * * *
//  * *
//  *
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int t = sc.nextInt();
        while (t >= 1){
            int n = sc.nextInt();
            
            // Outer Loop -> Rows
            for(int i = 1; i<=2*n-1; i++){
                int stars = i;
                if (i>n){
                    stars = 2*n - i;
                }
                // Inner Loop -> Columns
                for(int j = 1; j<=stars; j++){
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
