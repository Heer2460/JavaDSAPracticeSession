package com.binary.tree.string;

public class PalindromeString {

    static int isPalindrome(String S) {

        // code here
        for (int i=0; i<S.length()-1; i++){
            char start = S.charAt(i);
            for (int j=S.length()-1; j>=0; j--){
                char end = S.charAt(j);
                if (start ==end){
                    return 1;
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        String isPalin = "rhar";
        isPalindrome(isPalin);
    }
}
