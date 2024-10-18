public class LinearSearch {
    
    static <T> boolean linearSearch(T [] arr,T element)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == element)
            return true;
        }
        return false;
    }
}
