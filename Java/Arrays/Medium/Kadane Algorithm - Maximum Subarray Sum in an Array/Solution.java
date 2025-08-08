import java.util.Scanner;
// Brute Force Solution
// TC = O(N²)
// SC = O(1)

// For Kadane's Algorithm
// TC = O(n)
// SC = O(1)
public class Solution {
    private static void printArray(int[] arr, int start, int end){
        for (int i = start; i<=end; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    private static int maxSubarraySum(int[] nums) {
        int max = Integer.MIN_VALUE, sum = 0;
        for (int num : nums) {
            sum += num;
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }
    private static void printMaxSubarray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0, start = -1, end = -1, currStart = 0;
        for (int i = 0; i < nums.length; i++) {
            if (sum == 0) {
                currStart = i;
            }
            sum += nums[i];
            if (sum > max) {
                max = sum;
                start = currStart;
                end = i;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        printArray(nums, start, end);
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
            int m = maxSubarraySum(arr);
            System.out.println("Max Sum  = " + m);
            System.out.print("Subarray = ");
            printMaxSubarray(arr);
        }
        sc.close();
    }
}