import java.util.Scanner;

public class Solution {
    static void printArray(int[] arr){
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
    static void BubbleSort(int[] arr, int n){
        for (int i = 0; i<n; i++){
            int swapped = 0;
            for (int j = 0; j<n-i-1; j++){
                if (arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                    swapped = 1;
                }
            }
            if (swapped == 0){
                break;
            }
        }
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
            BubbleSort(arr, n);
            printArray(arr);
        }
        sc.close();
    }
}
