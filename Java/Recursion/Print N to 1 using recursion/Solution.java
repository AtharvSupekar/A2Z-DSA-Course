import java.util.Scanner;

public class Solution {
    public static void print_NTo1(int i, int n){
        if (i < 1){
            return;
        }
        System.out.println(i);
        print_NTo1(i-1, n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        print_NTo1(n, n);
    }
}
