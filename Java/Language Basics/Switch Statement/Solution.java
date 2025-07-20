import java.util.Scanner;
/*
Take the day no and print the corresponding day
    for 1 print Monday,
    for 2 print Tuesday and so on for 7 print Sunday.
*/

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Read the number of test cases.
        int t = sc.nextInt();

        // 2. Loop that many times.
        while (t > 0) {
            // Your original logic is now inside the loop.
            int day = sc.nextInt();

            switch (day) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
            
                default:
                    System.out.println("Invalid Input.");
                    break;
            }

            t--; // Decrement the test case counter.
        }

        sc.close(); // Close the scanner after the loop is done.
    }
}
