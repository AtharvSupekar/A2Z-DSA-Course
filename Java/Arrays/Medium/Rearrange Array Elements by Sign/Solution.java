import java.util.ArrayList;
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
    
    private static int[] BruteForce(int[] nums, int n) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        
        for (int num : nums) {
            if (num < 0)
                neg.add(num);
            else
                pos.add(num);
        }
        for (int i = 0; i < n/2; i++) {
            nums[2 * i]     = pos.get(i);
            nums[2 * i + 1] = neg.get(i);
        }
        return nums;
    }
    
    private static int[] Optimal(int[] nums, int n) {
        int[] ans = new int[n];
        int posIndex = 0, negIndex = 1;
        for (int i = 0; i < n; i++) {
            if (nums[i] < 0) {
                ans[negIndex] = nums[i];
                negIndex += 2;
            } else {
                ans[posIndex] = nums[i];
                posIndex += 2;
            }
        }
        return ans;
    }
    
    private static int[] Variant2(int[] nums, int n) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for (int num : nums) {
            if (num < 0)
                neg.add(num);
            else
                pos.add(num);
        }

        int posCount = pos.size();
        int negCount = neg.size();
        int minLen = Math.min(posCount, negCount);
        for (int i = 0; i < minLen; i++) {
            nums[2 * i] = pos.get(i);
            nums[2*i+1] = neg.get(i);
        }
        if (posCount > negCount) {
            int index = minLen * 2;
            for (int i = minLen; i < posCount; i++) {
                nums[index++] = pos.get(i);
            }
        } else {
            int index = minLen * 2;
            for (int i = minLen; i < negCount; i++) {
                nums[index++] = neg.get(i);
            }
        }
        return nums;
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
            // printArray(BruteForce(arr, n));
            // printArray(Optimal(arr, n));
            printArray(Variant2(arr, n));
        }
        sc.close();
    }
}