import java.util.Scanner;

public class Solution {    
    public static int Fibonacci(int n){
        // Base Condition
        if (n <= 1){
            return n;
        }
        // Recursive call
        return Fibonacci(n-1) + Fibonacci(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t>0){
            t--;
            // Input the string
            int n = sc.nextInt();
            // Call the function to check Fibonacci
            // n-1 because we use 1 based indexing
            // in the Fibonacci series
            System.out.println(Fibonacci(n-1));
        }
        sc.close();
    }
}
