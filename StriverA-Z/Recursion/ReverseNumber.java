package Recursion;

public class ReverseNumber {
    static int reverse(int rev,int n) {
        if(n==0) return rev; //1234
        return reverse(rev*10+n%10,n/10);
    }

    public static void main(String[] args) {
        System.out.println(reverse(0,102));
    }
}
