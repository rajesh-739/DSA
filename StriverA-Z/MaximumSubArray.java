public class MaximumSubArray {
    public static void main(String[] args) {
        int [] arr = {1,1,1,1,5,-2,-3,0,2,2,2};
//        System.out.println(getMaxSum(arr));
        printMaxSumSubArray(arr);
    }
    public static int getMaxSum(int [] arr) {
        int sum = 0,maxSum = 0;
        for(int i=0;i<arr.length;i++) {
            sum += arr[i];
            if(sum > maxSum) {
                maxSum = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return maxSum;
    }
    public static void printMaxSumSubArray(int [] arr) {
        int sum = 0,maxSum = 0;
        int indexStart = 0,indexEnd = 0;
        for(int i=0;i<arr.length;i++) {
            if(sum == 0) {
                indexStart = i;
            }
            sum += arr[i];
            if(sum >= maxSum) {
                maxSum = sum;
                indexEnd = i;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        System.out.print("[");
        for (int i = indexStart; i < indexEnd ; i++) {
            System.out.print(arr[i]+",");
        }
        System.out.print(arr[indexEnd]+"] =  "+maxSum);
    }
}
