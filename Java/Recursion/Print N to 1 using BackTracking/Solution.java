import java.util.Scanner;

public class Solution {
    public static void print_NTo1(int i, int n){
        if (i > n){
            return;
        }
        print_NTo1(i+1, n);
        System.out.println(i);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        print_NTo1(1, n);
    }
}
