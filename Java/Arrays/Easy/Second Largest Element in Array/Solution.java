import java.util.Scanner;

public class Solution {
    private static int secondLargest(int[] arr, int n){
        int Largest = arr[0], secondLargest = -1;
        for (int i=1; i<n; i++){
            if (arr[i] > Largest) {
                secondLargest = Largest;
                Largest = arr[i];
            } else if (Largest > arr[i] && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
    private static int secondSmallest(int[] arr, int n){
        int Smallest = arr[0], secondSmallest = Integer.MAX_VALUE;
        for (int i = 1; i<n; i++){
            if (arr[i] < Smallest){
                secondSmallest = Smallest;
                Smallest = arr[i];
            } else if (Smallest < arr[i] && arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }
        }
        return secondSmallest;  
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
            System.out.println("{SL: " + secondSmallest(arr, n) +  ", SS: " + secondLargest(arr, n) + "}");
        }
        sc.close();
    }
}
