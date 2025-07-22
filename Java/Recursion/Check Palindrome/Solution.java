import java.util.Scanner;

public class Solution {    
    public static boolean isPalindrome(int i, String s){
        int n = s.length();
        // Base Condition
        if (i >= n/2){
            return true;
        }
        // Check if characters at positions i and n-i-1 are equal
        if (s.charAt(i) != s.charAt(n - i - 1)){
            return false;
        }
        // Recursive call
        return isPalindrome(i+1, s);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t>0){
            t--;
            // Input the string
            String s = sc.next();
            // Call the function to reverse the array
            if (isPalindrome(0, s)){
                System.out.println("Palindrome");
            } else {
                System.out.println("Not a Palindrome");
            }
        }
        sc.close();
    }
}
