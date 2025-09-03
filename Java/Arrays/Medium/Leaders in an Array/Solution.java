import java.util.ArrayList;
import java.util.Scanner;
/*
    Brute Force Approach -
    TC = O(n^2) or O((n * (n + 1)) / 2)
    SC = O(n) - Worst Case (If array is sorted in descending order)

    Optimal Approach -
    TC = O(n)
    SC = O(n) - Worst Case (If array is sorted in descending order)
*/
public class Solution {
    private static void printArray(ArrayList arr){
        for (int i = 0; i < arr.size(); i++){
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
    }
    private static ArrayList findLeaders(int[] nums, int n) {
        ArrayList<Integer> leaders = new ArrayList<>();
        leaders.add(nums[n - 1]);
        int maxYet = nums[n - 1];
        for (int i = n - 2; i >= 0 ; i--) {
            if (nums[i] > maxYet) {
                maxYet = nums[i];
                leaders.add(nums[i]);
            }
        }
        return leaders;
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
            printArray(findLeaders(arr, n));
        }
        sc.close();
    }
}