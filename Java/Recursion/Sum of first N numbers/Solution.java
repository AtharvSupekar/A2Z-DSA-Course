import java.util.Scanner;
// Parameterized Approach
public class Solution {
    public static void print_Sum(int i, int sum){
        if (i == 0){
            System.out.println(sum);
            return;
        }
        sum += i;
        print_Sum(i - 1, sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        print_Sum(n, 0);
    }
}
