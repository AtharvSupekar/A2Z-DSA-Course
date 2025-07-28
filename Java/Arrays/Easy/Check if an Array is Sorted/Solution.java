import java.util.Scanner;

public class Solution {
    private static boolean isSorted(int[] arr){
        int n = arr.length;
        for (int i=1; i < n;i++){
            if (arr[i] >= arr[i-1]){

            } else {
                return false;
            }
        }
        return true;
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
            System.out.println(isSorted(arr));
        }
        sc.close();
    }
}
