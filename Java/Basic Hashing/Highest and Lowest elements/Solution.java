import java.util.HashMap;   
import java.util.Map;
import java.util.Scanner;

public class Solution {    
    public static void minMaxFrequency(int arr[], int n){
        Map<Integer, Integer> map = new HashMap<>();
        // Count frequency of each element
        for (int i = 0; i<n; i++){
            if (map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        int maxFreq = 0, minFreq = n;
        int maxEle = 0, minEle = 0;
        // Print the element with highest and lowest frequency
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            int element = entry.getKey();
            int count = entry.getValue();

            if (count > maxFreq){
                maxFreq = count;
                maxEle = element;
            }
            if (count < minFreq){
                minFreq = count;
                minEle = element;
            }
        }
        System.out.println("Highest Frequency Element: " + maxEle +  " with frequency: " + maxFreq);
        System.out.println("Lowest  Frequency Element: " + minEle +  " with frequency: " + minFreq);
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
            minMaxFrequency(arr, n);
        }
        sc.close();
    }
}
