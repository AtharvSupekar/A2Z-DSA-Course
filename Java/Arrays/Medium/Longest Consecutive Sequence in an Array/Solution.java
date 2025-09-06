import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
/*
    Brute Force Approach -
    TC = O(n^2)
    SC = O(1)

    Better Approach -
    TC = O(nlogn) - sorting
    SC = O(1)

    Optimal Approach -
    TC = O(n)
    SC = O(n) 
*/
public class Solution {
    private static boolean linearSearch(int[] a, int n) {
        for (int num : a) {
            if (num == n){
                return true;
            }
        }
        return false;
    }
    private static int longestConsecutiveBF(int[] nums, int n) {
        int longest = 0;
        for (int i = 0; i < n; i++) {
            int count = 1;
            while (linearSearch(nums, nums[i] + count)) {
                count++;
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }
    private static int longestConsecutiveBetter(int[] nums, int n) {
        int longest = 0;
        Arrays.sort(nums);
        int countCurrent = 0, lastSmaller = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num - 1 == lastSmaller) {
                countCurrent++;
                lastSmaller = num;
            } else if (num != lastSmaller) {
                countCurrent = 1;
                lastSmaller = num;
            }
            longest = Math.max(longest, countCurrent);
        }
        return longest;
    }
    private static int longestConsecutiveOP(int[] nums, int n) {
        int longest = 0;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        for (int num: set) {
            if (!set.contains(num - 1)) {
                int count = 1;
                while (set.contains(num + count)) {
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
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
            System.out.println(longestConsecutiveBF(arr, n));
            System.out.println(longestConsecutiveBetter(arr, n));
            System.out.println(longestConsecutiveOP(arr, n));
        }
        sc.close();
    }
}