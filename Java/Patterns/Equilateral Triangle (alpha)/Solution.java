import java.util.Scanner;
// For an input n = 5 
// Print the RAT - left incline Pattern using alphabets.
//         A         
//       A B A       
//     A B C B A     
//   A B C D C B A   
// A B C D E D C B A 
// Approach -> [space, chars, space]
// Line 1 -> [4,1,4]
// Line 2 -> [3,3,3]
// Line 3 -> [2,5,2]
// Line 4 -> [1,7,1]
// Line 5 -> [0,9,0]
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int t = sc.nextInt();
        while (t >= 1){
            int n = sc.nextInt();
            
            // Outer Loop -> Rows
            for(int i = 0; i<n; i++){
                // Inner Loop -> Columns
                // space
                for(int j = 0; j<n-i-1; j++){
                    System.out.print("  ");
                }
                // chars
                char ch = 'A';
                int breakpoint = (2*i+1) / 2;
                for(int j = 0; j<2*i+1; j++){
                    System.out.print(ch + " ");
                    if (j < breakpoint){
                        ch++;
                    }else{
                        ch--;
                    }
                }
                // space
                for(int j = 0; j<n-i-1 ; j++){
                    System.out.print("  ");
                }
                System.out.println();
            }
            t--;
            System.out.println();
        } 
        sc.close();  
    }
}
