import java.util.Scanner;

public class Solution {
    private static void printArray(int[] arr, int n){
        for (int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    private static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
    private static void moveZeroesToEnd(int[] arr, int n){
        int j = -1;
        for (int i = 0; i<n; i++){
            if (arr[i] == 0){
                j = i;
                break;
            }
        }
        if (j == -1) return;
        for (int i = j+1; i<n; i++){
            if (arr[j] != arr[i]){
                swap(arr, i, j);
                j++;
            }
        }

        // OR 
        // int j = 0; // Pointer to place the next non-zero element
        // for (int i = 0; i < nums.length; i++) {
        //     if (nums[i] != 0) {
        //         // Swap current element with the element at index j 
        //         swap(nums, i, j);
        //         j++;   // Move j to the next index for placing non-zero
        //     }
        // }
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
            moveZeroesToEnd(arr, n);
            printArray(arr, n);
        }
        sc.close();
    }
}
