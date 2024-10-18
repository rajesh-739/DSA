import java.util.Arrays;

public class QuickSort
{
	public static void swap(int arr[],int i,int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static int pivot(int [] array,int pivotIndex,int EndIndex)
	{
		int j = pivotIndex;
		int i;
		for(i = pivotIndex+1;i<EndIndex;i++)
		{
			if(array[pivotIndex] > array[i])
			{
				j++;
				swap(array,j,i);
			}
		}
		swap(array,pivotIndex,j);
		return j;
	}
    public static void quicksort(int arr[],int start,int end)
    {
        if(start < end) {
            int pivotIndex = pivot(arr, start, end);
            quicksort(arr, start,pivotIndex);
            quicksort(arr, pivotIndex+1, end);
        }
    }
	public static void main(String[] args) {
		int arr[] = {5,8,7,3,4};
        quicksort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
	}
}