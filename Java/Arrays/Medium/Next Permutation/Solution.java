import java.util.Scanner;
/*
    Brute Force Solution
    TC = O(2N) rather O(1.5N)
    SC = O(N)

    For Optimal Solution
    TC = O(N)
    SC = O(N)

    For Variant Solution
    TC = O(2N)
    SC = O(N)
*/
public class Solution {
    private static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    
    private static void nextPermutation(int[] nums, int n) {
        // 1. Find the breakpoint
        int bp = -1;
        for (int i = n - 2; i >= 0 ; i--) {
            if (nums[i] < nums[i + 1]){
                bp = i;
                break;
            }
        }
        // 2. If no Breakpoint is found - return reversed array
        if (bp == -1) {
            reverse(nums, 0, n-1);
            return;
        }
        // 2. Find the just greater element in the array right of the bp
        for (int i = n - 1; i > bp; i--) {
            if (nums[i] > nums[bp]) {
                // 3. Perform the Swap
                swap(nums, bp, i);
                break;
            }
        }
        // 4. Reverse the array to right of bp to make it smallest version of itself
        reverse(nums, bp + 1, n - 1);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();   
        while (t >= 1){ 
            t--;
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            nextPermutation(arr, n);
            printArray(arr);
        }
        sc.close();
    }
}