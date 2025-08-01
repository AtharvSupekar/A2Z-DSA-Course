import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/*
 * TC = O(2N)
 * SC = O(1)
 */
public class Solution {
    private static void printArray(int[] arr){
        int n = arr.length;
        for (int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    private static int[] longestSubarray(int[] arr, int k){
        long sum = 0;
        int maxLen = 0, end_of_longest = -1, start_of_longest = -1;
        Map<Long , Integer> preSumMap = new HashMap<>();
        preSumMap.put(0L, -1);

        for (int i = 0; i<arr.length; i++){
            sum += arr[i];
            if (preSumMap.containsKey(sum - k)){
                int currentLen = i - preSumMap.get(sum-k);
                if (currentLen > maxLen){
                    maxLen = currentLen;
                    start_of_longest = preSumMap.get(sum - k) + 1;
                    end_of_longest = i;
                }
            }
            if (!preSumMap.containsKey(sum)){
                preSumMap.put(sum, i);
            }
        }
        if (start_of_longest != -1) {
            int length = end_of_longest - start_of_longest + 1;
            int[] subArray = new int[length];
            System.arraycopy(arr, start_of_longest, subArray, 0, length);
            return subArray;
        }
        else {
            return new int[0];
        }
    }

    private static int longestSubarray2P(int[] arr, int k){
        int maxLen = 0;
        int n = arr.length;
        int left = 0, right = 0, sum = 0;

        while (right < n){
            sum += arr[right];
            while (sum > k) {
                sum -= arr[left];
                left++;
            }
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
            right++;
        }
        return maxLen;
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
            int k = sc.nextInt();
            int[] result = longestSubarray(arr, k);
            printArray(result);
            System.out.println(longestSubarray2P(arr, k));
        }
        sc.close();
    }
}
