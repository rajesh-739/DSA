public class MoveZerosToEnd {
    /*
     * in this two pointer approach we going to use first i will point
     * out where the 0 is then i will iterate the array i
     * if any non zero appears i will swap with it.
     */
    public static void main(String[] args) {
        int arr[] = {3, 1, 0, 0, 4};
        int j=-1,i;
        for(i=0;i<arr.length;i++)
        {
            if(arr[i] == 0)
            {
                j=i;break;
            }
        }
        if (j == -1) {
            System.out.println("No zeros found in the array "); return;
        }
        for(i=j+1;i<arr.length;i++)
        {
            if(arr[i] != 0)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        for(int k:arr) System.out.print(k+" ");
    }
    /*
     * Brute force approach is i will add all the non zero elements to 
     * a temprory array and fill the original array with the temp array 
     * elements then replace remaining elements 
        var ls = new ArrayList<Integer>();
        for(var num : arr){
            if(num!=0)ls.add(num);
            }
            for(int i=0;i<ls.size();i++){
                arr[i]=ls.get(i);
                }
            for(int i=ls.size;i<arr.size;i++)
                {
                    arr[i]=0;
                }
     */
}
