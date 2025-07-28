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
    static int partition(int[] arr, int low, int high){
        int pivot = arr[low];
        int i = low, j = high;

        while (i < j) {
            // Move 'i' from left, find element > pivot
            while (arr[i] <= pivot && i <= high - 1) {
                i++;
            }
            // Move 'j' from right, find element <= pivot
            while (arr[j] > pivot && j >= low + 1) {
                j--;
            }
            // If i and j haven't crossed, swap elements at i and j
            if (i < j) {
                swap(arr, i, j);
            }
        }
        // After the loop, swap the pivot element (originally at arr[low])
        // with the element at index 'j'. 'j' is the correct position for the pivot.
        swap(arr, low, j);
        return j; // pIndex is j (Look at algorithm and dry run)
    }
    static void quickSort(int[] arr, int low, int high){
        // Base case: If low is less than high, there's more than one element to sort
        if (low < high){
            int pIndex = partition(arr, low, high);
            quickSort(arr, low, pIndex - 1);    // Sort the left partition
            quickSort(arr, pIndex + 1, high);   // Sort the right partition
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
            quickSort(arr, 0, n-1);
            printArray(arr);
        }
        sc.close();
    }
}
