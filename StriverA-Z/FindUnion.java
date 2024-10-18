
import java.util.ArrayList;

public class FindUnion {
    public static void main(String[] args) {
    int arr1[] = {1,2,3,4,5,6};
    int arr2[] = {2,3,4,5,6,7};
    var union = new ArrayList<Integer>();
    int i=0,j=0;
    while (i < arr1.length && j < arr2.length) {
        if(arr1[i] <= arr2[j]) {
            if(union.size() == 0 || union.get(union.size()-1) != arr1[i]) union.add(arr1[i]);
            i++;
        }
        else {
            if(union.size() == 0 || union.get(union.size()-1) != arr2[j]) union.add(arr2[j]);
            j++;
        }
    }
    while (i<arr1.length) {
        if(union.size() == 0 || union.get(union.size()-1) != arr1[i])
        union.add(arr1[i]);
        i++;
    }
    while (j<arr2.length) {
        if(union.size()==0 || union.get(union.size()-1) != arr2[j])
        union.add(arr2[j]);
        j++;
    }
    System.out.println(union);
    }
}
