import java.util.Arrays;

public class RemoveDuplicatesSorted {
    public static void main(String[] args) {
        int arr[] = {0,0,0,1,2,3,4,4,5};
        int i=0;
        for(int j=i+1;j<arr.length;j++)
        {
            if(arr[i] != arr[j]) {
                arr[++i] = arr[j];
            }
            
        }
        System.out.println(Arrays.toString(arr));
    }
}
