import java.util.Scanner;
/*
    Take the age from the user and then decide accordingly
    1. If age < 18,
        print-> not eligible for job
    2. If age >= 18,
        print-> "eligible for job"
    3. If age >= 55 and age <= 57.
        print-> "eligible for job, but retirement soon."
    4. 11 age > 57
        print-> "retirenent time"
 */

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Read the number of test cases.
        int t = sc.nextInt();

        // 2. Loop that many times.
        while (t > 0) {
            // Your original logic is now inside the loop.
            int age = sc.nextInt();

            if (age < 18){
                System.out.println("not eligible for job");
            } else if(age <= 57){
                System.out.print("eligible for job");
                if (age >= 55){
                    System.out.print(", but retirement soon.");
                }
                System.out.println();
            } else{
                System.out.println("retirement time");
            }

            t--; // Decrement the test case counter.
        }

        sc.close(); // Close the scanner after the loop is done.
    }
}
