package Recursion;

public class SortedOrNot {
    public static boolean isSorted(int [] arr) {
        return helper(arr,0);
    }
    static boolean helper(int [] arr, int i) {
        if(i+1 == arr.length) return  true;
        if(arr[i] < arr[i+1]) {
            return helper(arr,i+1);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isSorted(new int[] {4}));
    }
}
