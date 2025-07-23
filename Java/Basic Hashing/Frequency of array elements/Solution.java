import java.util.HashMap;   
import java.util.Map;
import java.util.Scanner;

public class Solution {    
    public static void Frequency(int arr[], int n){
        Map<Integer, Integer> map = new HashMap<>();
        // Count frequency of each element
        for (int i = 0; i<n; i++){
            if (map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        // Print the frequency of each element
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t>0){
            t--;
            // Input the string
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            Frequency(arr, n);
        }
        sc.close();
    }
}
