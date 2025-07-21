import java.util.Scanner;
// For an input n = 5 
// Print the RAT Inverted - left incline Pattern using alphabets.
// E 
// D E 
// C D E 
// B C D E 
// A B C D E 
public class Solution {
    public static void main(String[] args) {    
        Scanner sc = new Scanner((System.in));
        int t = sc.nextInt();
        while (t >= 1){
            int n = sc.nextInt();
            
            // Outer Loop -> Rows
            char end = (char) (65 + n - 1);
            for(int i = 0; i<n; i++){
                // Inner Loop -> Columns
                for(char ch = (char) ('A' + n - i - 1); ch <= end; ch++){
                    System.out.print(ch + " ");
                }   
                System.out.println();
            }
            t--;
            System.out.println();
        } 
        sc.close();  
    }
}
