package MountBluePrepartion;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SuperReducedString {
    public static void main(String[] args) {
//        String s = "aaabccddd";
//        HashMap<String,Integer> hash = new HashMap<>();
//        String [] strs = s.split("");
//        for(var ss : strs) {
//            hash.put(s,hash.getOrDefault(ss,0)+1);
//        }
//        StringBuilder newStr = new StringBuilder();
//        for(var ss: hash.keySet()) {
//            int val = hash.get(ss);
//            if(val%2 == 1) {
//                newStr.append(ss);
//            }
//        }
//        System.out.println(newStr);

        Scanner sc = new Scanner(System.in);
        HashMap<Integer,Integer> pairs = new HashMap<>();
        int n = sc.nextInt();
        int min=10001,max = 0;
        for(int i=0;i<n;i++) {
            int times = sc.nextInt();
            int number = sc.nextInt();
            pairs.put(times,number);
            if(times > max) max = times;
            if(times < min) min = times;
        }
        int maxValue = 0,minValue = 0;
        for(Map.Entry<Integer,Integer> e : pairs.entrySet()) {
            int value = e.getValue();
            if(e.getKey() == max && maxValue < value) {
                maxValue = value;
            }
            if(e.getKey() == min && minValue > value) {
                minValue = e.getValue();
            }
        }
        System.out.println(maxValue-minValue);
    }
}
