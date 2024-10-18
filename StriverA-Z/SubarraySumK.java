import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class SubarraySumK {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();
        var k = sc.nextInt();
        int sum = 0,len = 0;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) 
        {
            sum += arr[i];

            if(sum == k) {
                len = Math.max(len, i+1);
            }
            
            int diff = sum - k;
            if(map.containsKey(diff)) {
                len = Math.max(len,(i - map.get(diff)));
            }
            if(!map.containsKey(sum)) {
                map.put(arr[i],i);
            }
        }
        System.out.println("Length is "+len);
        sc.close();
    }
}
