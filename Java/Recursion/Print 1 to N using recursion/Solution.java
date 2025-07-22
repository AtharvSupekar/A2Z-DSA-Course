import java.util.Scanner;

public class Solution {
    public static void print_1ToN(int i, int n){
        if (i > n){
            return;
        }
        System.out.println(i);
        print_1ToN(i + 1, n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        sc.close();
        print_1ToN(i, n);
    }
}
