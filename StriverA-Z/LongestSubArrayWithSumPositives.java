import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithSumPositives {
    public static void main(String[] args) {

        int [] arr = {-1,1,1,-3,-1,1,1,1,1};
        System.out.println(longestSubArrayWithPositives(arr,3));
        System.out.println(longestSubArrayLength(arr,3));
    }

    public static int longestSubArrayLength(int [] arr,int k) {
        int maxLen = 0;
        int sum = 0;
        Map<Integer,Integer> preSum = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if(sum == k) {
                maxLen = Math.max(maxLen,i+1);
            }
            int x = sum - k;
            if(preSum.containsKey(x)) {
                maxLen = Math.max(maxLen,i-preSum.get(x));
            }
            if(!preSum.containsKey(sum)) preSum.put(sum,i);
        }
        return maxLen;
    }

    public  static int longestSubArrayWithPositives(int [] arr,int k) {
        int maxLen = 0;
        int left = 0, right = 0;
        int sum = 0;
        while(right < arr.length) {
            sum += arr[right];
            if(sum == k) {
                maxLen = Math.max(maxLen,right-left+1);
            }
            while (left < right && sum > k) {
                sum -= arr[left];
                left++;
            }
            right++;
        }
        return maxLen;
    }
}
