import java.util.Scanner;
    // For an input n = 5 
    // Print the RAT - left incline Pattern using '0' and '1'.
    //  1
    //  0 1
    //  1 0 1
    //  0 1 0 1
    //  1 0 1 0 1
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int t = sc.nextInt();
        while (t >= 1){
            int n = sc.nextInt();
            // Outer Loop -> Rows
            for(int i = 1; i<=n; i++){
                int start;
                if (i%2 == 0){
                    start = 0;
                } else{
                    start = 1;
                }
                // Inner Loop -> Columns
                for(int j = 1; j<=i; j++){
                    System.out.print(start + " ");
                    start = 1 - start;
                }
                System.out.println();
            }
            t--;
            System.out.println();
        } 
        sc.close();  
    }
}
