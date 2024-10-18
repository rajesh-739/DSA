package Recursion;

public class Fibanocci {
    public  int fibnocciSeries(int n) {
        if(n <= 1) {
            return n;
        }
        return  fibnocciSeries(n-1) + fibnocciSeries(n-2);
    }
}
