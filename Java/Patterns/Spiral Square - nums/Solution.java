import java.util.Scanner;

//  For an input n = 5 
//  Print the Solid Square Pattern using numbers.
//     5 5 5 5 5 5 5 5 5 
//     5 4 4 4 4 4 4 4 5 
//     5 4 3 3 3 3 3 4 5 
//     5 4 3 2 2 2 3 4 5 
//     5 4 3 2 1 2 3 4 5 
//     5 4 3 2 2 2 3 4 5 
//     5 4 3 3 3 3 3 4 5 
//     5 4 4 4 4 4 4 4 5 
//     5 5 5 5 5 5 5 5 5 

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int t = sc.nextInt();
        while (t >= 1){
            int n = sc.nextInt();
            
            // Outer Loop -> Rows
            for(int i = 0; i<2*n-1; i++){
                // Inner Loop -> Columns
                for (int j =0; j<2*n-1; j++){
                    int top = i;
                    int left = j;
                    int bottom = 2*n - 1 - 1 - i;
                    int right = 2*n - 1 - 1 - j;
                    System.out.print(n - Math.min(Math.min(top, bottom), Math.min(left, right)) + " ");
                }
                System.out.println();
            }
            t--;
            System.out.println();
        } 
        sc.close();  
    }
}
