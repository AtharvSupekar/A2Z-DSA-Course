import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/*
    Brute Force Approach - 
        TC = O(n*n*n)
        SC = O(1)
    Better Approach - 
        TC = O(n*n)
        SC = O(1)
    Optimal Approach -
        TC = O(n)
        SC = O(n) Worst Case for HashMap
*/
public class Solution {    
    private static int countSubarraySumEqualsKBF(int[] nums, int n, int target) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += nums[k];
                }
                if (sum == target) {
                    count++;
                }
            }
        }
        return count;
    }
    private static int countSubarraySumEqualsKBetter(int[] nums, int n, int target) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                if (sum == target) {
                    count++;
                }
            }
        }
        return count;
    }
    private static int countSubarraySumEqualsKOP(int[] nums, int n, int target) {
        int count = 0, preSum = 0;
        Map<Integer, Integer> preSumMap = new HashMap<>();
        preSumMap.put(0, 1);
        for (int num : nums) {
            preSum += num;
            count += preSumMap.getOrDefault(preSum - target, 0);
            preSumMap.put(preSum, preSumMap.getOrDefault(preSum, 0) + 1);
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int t = sc.nextInt();   
        while (t >= 1){ 
            t--;
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            int target = sc.nextInt();
            int resultBF = countSubarraySumEqualsKBF(nums, n, target);
            int resultBetter = countSubarraySumEqualsKBetter(nums, n, target);
            int resultOP = countSubarraySumEqualsKOP(nums, n, target);
            System.out.println("Brute = " + resultBF + ", Better = " + resultBetter + ", Optimal = " + resultOP);
        }
        sc.close();
    }   
}