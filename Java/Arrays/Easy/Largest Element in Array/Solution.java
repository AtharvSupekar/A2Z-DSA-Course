import java.util.Scanner;

public class Solution {
    private static int LargestElement(int[] arr){
        int largest = arr[0];
        for (int num : arr){
            if (num > largest){
                largest = num;
            }
        }
        return largest;
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
            System.out.println(LargestElement(arr));
        }
        sc.close();
    }
}
