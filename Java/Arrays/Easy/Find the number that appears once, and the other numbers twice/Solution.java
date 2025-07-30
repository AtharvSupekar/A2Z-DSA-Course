import java.util.Scanner;

public class Solution {
    private static int singleNumber(int[] arr){
        int xor = 0;
        for (int num: arr){
            xor ^= num;
        }
        return xor;
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
            System.out.println(singleNumber(arr));
        }
        sc.close();
    }
}
