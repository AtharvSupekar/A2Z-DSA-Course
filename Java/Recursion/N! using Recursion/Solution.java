import java.util.Scanner;
// Functional Approach
public class Solution {
    public static int print_Factorial(int n){
        if (n == 1){
            return 1;
        }
        return n * print_Factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(print_Factorial(n));
    }
}
