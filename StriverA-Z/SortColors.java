import java.util.Arrays;

/* Sort 0,1,2 */
public class SortColors {
    public static void main(String[] args) {
        int [] arr = {1,0,2,0,0,2,1,1,0,2};
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sortColors(int [] arr) {  // Dutch Flag Algorithm
        // optimized solution
        int low = 0, high = arr.length-1, mid = 0;
        while(mid <= high) {
            if(arr[mid] == 0) {
                swap(arr,mid,low);
                low++;
                mid++;
            }
            else if(arr[mid] == 2) {
                swap(arr,mid,high);
                high--;
            }
            else {
                mid++;
            }
        }
    }
    public static void swap(int [] arr,int i,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
