public class SubarraySumKP {
    public static void main(String[] args) {
        int arr[] = {6,4,9,10,34,56,54};
        int k = 10;
        int n = arr.length;
        int len=0;
        long sum =0;
        int left=0,right=0;
        while(right < n)
        {
            sum += arr[right];
            if(sum > k) {
                sum -= arr[left];
                left++;
            }
            if(sum == k)
            {
                len = Math.max(len, right-left+1);
            }
            right++;
        }
        System.out.println(len);
    }
}