import java.util.ArrayList;
import java.util.Scanner;
/*
 * TC = O(N+M)
 * SC = O(N+M) - for array union
 */
public class Solution {
    // Function to find the union of two sorted arrays (using two pointers)
    private static ArrayList<Integer> Union(int[] arr1, int[] arr2, int n1, int n2){
        // Pointers for arr1 and arr2, initialized to their start
        int i = 0, j = 0;
        // List to store the unique elements of the union
        ArrayList<Integer> union = new ArrayList<>();
        
        // Main merge loop: continues as long as both pointers are within their array limits
        while (i < n1 && j < n2) {
            // Compare current elements from both arrays
            if (arr1[i] <= arr2[j]){
                // Add arr1[i] to union only if it's the first element
                // OR if it's different from the last element already added (to handle duplicates)
                if (union.isEmpty() || union.get(union.size() - 1) != arr1[i]){
                    union.add(arr1[i]);
                }
                i++; // Always move arr1's pointer forward
            } else { // arr2[j] is smaller
                // Add arr2[j] to union only if it's the first element
                // OR if it's different from the last element already added
                if (union.isEmpty() || union.get(union.size() - 1) != arr2[j]){
                    union.add(arr2[j]);
                }
                j++; // Always move arr2's pointer forward
            }
        }
        
        // Handle remaining elements in arr1 (if any are left after main loop)
        while (i < n1) {
            // Add only if not a duplicate of the last added element
            if (union.isEmpty() || union.get(union.size() - 1) != arr1[i]){
                union.add(arr1[i]);
            }
            i++;
        }
        
        // Handle remaining elements in arr2 (if any are left after main loop)
        while (j < n2) {
            // Add only if not a duplicate of the last added element
            if (union.isEmpty() || union.get(union.size() - 1) != arr2[j]){
                union.add(arr2[j]);
            }
            j++;
        }
        
        return union; // Return the final list containing unique elements from both arrays, in sorted order
    }
    
    // Main method: Handles input/output for testing
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Read number of test cases
        while (t >= 1){ 
            t--;
            
            // Read arr1
            int n1 = sc.nextInt();
            int[] arr1 = new int[n1];
            for (int i = 0; i < n1; i++){
                arr1[i] = sc.nextInt();
            }
            
            // Read arr2
            int n2 = sc.nextInt();
            int[] arr2 = new int[n2];
            for (int i = 0; i < n2; i++){
                arr2[i] = sc.nextInt();
            }
            
            // Call Union function and print the result
            ArrayList<Integer> union = Union(arr1, arr2, n1, n2);
            for (int num : union){
                System.out.print(num + " ");
            }
            System.out.println(); // Newline after each test case output
        }
        sc.close(); // Close the scanner
    }
}