// import java.util.HashSet;
// import java.util.Set;
// import java.util.TreeSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,3,4};
        int i=0,j=1;
        while (j<arr.length) {
            if(arr[i] != arr[j])
            {
                arr[++i] = arr[j++];
            }
            j++;
        }
        for(int k=0;k<=i;k++) System.out.println(arr[k]+" ");
        // Set<Integer> st = new HashSet<>();
        // for (Integer integer : arr) {
        //     st.add(integer);
        // }
        // System.out.println(st);
    }
}
