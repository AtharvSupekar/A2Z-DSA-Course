import java.util.Scanner;
/*  
 * Using Map or even MergeSort
 * TC = O(2N)
 * SC = O(N) for map and O(1) for MS
 * 
 * For Moore Voting Algorithm
 * TC = O(n) - Single Pass Algo (if given that a 
 *             majority element always exists - else O(2n))
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
    private static int majorityElement(int[] nums) {
        // Moore's Voting Algo
        int element = 0;
        int cnt = 0;
        for (int num : nums) {
            if (cnt == 0) {
                element = num;
                cnt++;
            } else if (num == element) {
                cnt++;
            } else {
                cnt--;
            }
        }
        return element;
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
            int m = majorityElement(arr);
            System.out.println(m);
        }
        sc.close();
    }
}