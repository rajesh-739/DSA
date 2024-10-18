package MountBluePrepartion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GetPairs {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hash = new HashMap<>();
        List<Integer> arr = new ArrayList<>(Arrays.asList(1,1,1,2,2,3,3,4,4,4));
        for(int element : arr) {
            hash.put(element,hash.getOrDefault(element,0)+1);
        }
        int countPairs = 0;
        for(int value : hash.values()) {
            countPairs += value/2;
        }
        System.out.println("No of Pairs are : "+countPairs);
    }
}
