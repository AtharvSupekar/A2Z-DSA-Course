import java.util.Scanner;
/*
 * A school has following rules tor grading systeu:
 *  a. Below 25 - F

    b. 25 to 44 - E

    c. 45 to 49 - D

    d. so to S9 - C

    e. 60 to 79 - 8

    f. 80 to 100 - A
    Ask user to enter marks and print the corresponding grade.
 */

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Read the number of test cases.
        int t = sc.nextInt();

        // 2. Loop that many times.
        while (t > 0) {
            // Your original logic is now inside the loop.
            int marks = sc.nextInt();

            if (marks < 25) {
                System.out.println("F");
            } else if (marks <= 44) {
                System.out.println("E");
            } else if (marks <= 49) {
                System.out.println("D");
            } else if (marks <= 59) {
                System.out.println("C");
            } else if (marks <= 79) {
                System.out.println("B");
            } else if (marks <= 100) {
                System.out.println("A");
            }

            t--; // Decrement the test case counter.
        }

        sc.close(); // Close the scanner after the loop is done.
    }
}