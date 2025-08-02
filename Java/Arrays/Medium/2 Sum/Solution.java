import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/*
 * TC = O(N)
 * SC = O(N)
 */
public class Solution {
    private static void printArray(int[] arr){
        int n = arr.length;
        for (int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    private static int[] twoSum(int[] arr, int sum){
        int n = arr.length;
        Map<Integer,Integer> idx_Map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int currentNum = arr[i];
            int complement = sum - currentNum;
            if (idx_Map.containsKey(complement)){
                return new int[] {i, idx_Map.get(complement)};
            }
            idx_Map.put(currentNum, i);
        }
        return new int[] {-1,-1};
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
            int[] result = twoSum(arr, k);
            printArray(result);
        }
        sc.close();
    }
}
