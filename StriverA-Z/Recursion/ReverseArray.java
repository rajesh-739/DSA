package Recursion;

public class ReverseArray {

    public  void swap(int []arr,int start,int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public  void reverse(int start,int end,int [] arr) {
        if(start > end) {
            return;
        }
        swap(arr,start,end);
        start++;
        end--;
        reverse(start,end,arr);
    }
}
