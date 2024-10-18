package Recursion;

public class Palindrome {
    public  boolean checkPalindrome(char [] arr,int start,int end) {
        if(arr[start] != arr[end]) {
            return false;
        }
        if(start > end) {
            return true;
        }
        return checkPalindrome(arr,start+1,end-1);
    }
}
