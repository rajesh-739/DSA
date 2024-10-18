import java.util.ArrayList;

public class FindInterSection {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int arr2[] = {2,3,4};
        var list = new ArrayList<Integer>();
        int i=0,j=0;
        while(i < arr.length && j < arr2.length)
        {
            if(arr[i] < arr2[j]) i++;
            else if(arr[i] > arr2[j]) j++;
            else {
                list.add(arr[i]);
                i++;j++;
            }
        }
        System.out.println(list);
    }
    /*
     * Brute force approach is to have a visited array we looping from 
     *  visited[] = {0};
     * for( i --> n1)
     * {
     *      for(j-->n2) {
     *         if(arr[i] == arr2[j] && visited[i] == 0)
     *            list.add(arr[i]); visited[j] = 1;
     *         if(arr[i] < arr[j]) break;
     * }
     * }
     */
}
