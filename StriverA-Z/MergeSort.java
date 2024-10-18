import java.util.Arrays;

public class MergeSort
{
    public static int[] merge( int []arr1,int []arr2)
    {
        int [] combined = new int[arr1.length+arr2.length];
        int i=0,j=0,k=0;
        while(i<arr1.length && j<arr2.length)
        {
            if(arr1[i]<arr2[j])
            {
                combined[k] = arr1[i];
                i++;
            }
            else
            {
                combined[k] = arr2[j];
                j++;
            }
            k++;
        }
        while(i<arr1.length)
        {
            combined[k++] = arr1[i++];
        }
        while(j<arr2.length)
        {
            combined[k++] = arr2[j++];
        }
        return combined;
    }
    public static int [] mergeSort(int array[])
    {
        if(array.length == 1) return array;
        int midIndex = array.length/2;
        int left[] = mergeSort(Arrays.copyOfRange(array,0,midIndex));
        int right[] = mergeSort(Arrays.copyOfRange(array, midIndex, array.length));
        return merge(left, right);
        
    }
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 1, 9};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}