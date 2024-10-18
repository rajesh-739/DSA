package BinarySearchPractice;

public class CeilOfNumber {

    static int getCeil(int [] arr,int x) {
        int start = 0, end = arr.length-1;
        while(start<end) {
            int mid = start + (end-start)/2;
            if(arr[mid] == x) {
                return x;
            } else if (arr[mid] > x) {
                end = mid-1;
            }
            else {
                start = mid+1;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = new int[] {
                1,2,3,5,6,9
        };
        System.out.println(getCeil(arr,8));
    }
}
