import java.util.Scanner;

public class Solution {
    public static void print_1ToN(int i, int n){
        if (i < 1){
            return;
        }
        print_1ToN(i - 1, n);
        System.out.println(i);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        print_1ToN(n, n);
    }
}
