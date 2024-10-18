import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Union {
    public static List<Integer> findUnion(List<Integer> arr1, List<Integer> arr2) {
        List<Integer> union = new ArrayList<>();
        int i=0,j=0;
        while (i<arr1.size() && j < arr2.size()) {
            if(arr1.get(i) < arr2.get(j)) {
                if(union.isEmpty() || !union.getLast().equals(arr1.get(i))) {
                    union.add(arr1.get(i));
                }
                i++;
            }
            else if(arr1.get(i) > arr2.get(j)) {
                if(union.isEmpty() || !union.getLast().equals(arr2.get(j))) {
                    union.add(arr2.get(j));
                }
                j++;
            }
            else {
                if(union.isEmpty() || !union.getLast().equals(arr2.get(j))) union.add(arr1.get(i));
                i++;
                j++;
            }
        }
        while (i < arr1.size()) {
            if(!union.getLast().equals(arr1.get(i))) {
                union.add(arr1.get(i));
            }
            i++;
        }
        while (j < arr2.size()) {
            if(!union.getLast().equals(arr2.get(j))) {
                union.add(arr2.get(j));
            }
            j++;
        }

        return union;
    }

    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1,2,2,2,3,4,5,6);
        List<Integer> l2 = Arrays.asList(3,3,3,3,4);
        System.out.println(findUnion(l2,l1));
    }
}
