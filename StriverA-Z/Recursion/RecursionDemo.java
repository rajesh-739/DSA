package Recursion;

import java.util.ArrayList;
import java.util.List;

public class RecursionDemo {
    static void print(int n,int i,List<Integer> l) {
        if(i > n) {
            return;
        }
        print(n,i+1,l);
        l.add(i);
    }

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        print(4,1,l);
    }
}
