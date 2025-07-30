import java.util.Scanner;

public class Solution {
    private static void printArray(int[] arr, int newLength){
        for (int i = 0; i<newLength; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    private static int removeDups(int[] arr, int n){
        if (n == 0) 
            return 0;
        int slow = 0;
        for (int fast = 1; fast < n; fast++){
            if (arr[fast] != arr[slow]){
                slow++;
                arr[slow] = arr[fast];
            }
        }
        return slow+1;  
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
            int newLength = removeDups(arr, n);
            System.out.println(newLength);  
            printArray(arr, newLength);
        }
        sc.close();
    }
}
