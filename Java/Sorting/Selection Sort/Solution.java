import java.util.Scanner;

public class Solution {
    static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
    static void printArray(int[] arr){
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static int[] selectionSort(int[] arr, int n){
        for(int i=0; i<n; i++){
            int min_idx = i;
            for(int j = i+1; j<n; j++){
                if (arr[j] < arr[min_idx]){
                    min_idx = j;
                }
            }
            if (min_idx != i){
                swap(arr, min_idx, i);
            }
        }
        return arr;
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
            selectionSort(arr, n);
            printArray(arr);
        }
        sc.close();
    }
}
