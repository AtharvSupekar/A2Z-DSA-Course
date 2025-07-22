import java.util.Scanner;

public class Solution {
    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void reverseArray(int[] arr, int start, int n){
        // Base Condition 
        if (start >= n/2){
            printArray(arr);
            return;
        }
        // Swap the elements
        int temp = arr[start];
        arr[start] = arr[n - start - 1];
        arr[n - start - 1] = temp;

        // Recursive call
        reverseArray(arr, start + 1, n);
        // Or use the Collections method to reverse the array
        // Collections.reverse(Arrays.asList(arr));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t>0){
            t--;
            // Input the size of the array
            // and the elements of the array  
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            // Call the function to reverse the array
            reverseArray(arr, 0, n);
            System.out.println();
        }
        sc.close();
    }
}
