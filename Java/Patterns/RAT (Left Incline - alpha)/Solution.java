import java.util.Scanner;
// For an input n = 5 
// Print the RAT - left incline Pattern using alphabets.
//  A
//  A B
//  A B C
//  A B C D
//  A B C D E
public class Solution {
    public static void main(String[] args) {    
        Scanner sc = new Scanner((System.in));
        int t = sc.nextInt();
        while (t >= 1){
            int n = sc.nextInt();
            
            // Outer Loop -> Rows
            for(int i = 0; i<n; i++){
                // Inner Loop -> Columns
                for(char ch = 'A'; ch <= 'A'+i; ch++){
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
