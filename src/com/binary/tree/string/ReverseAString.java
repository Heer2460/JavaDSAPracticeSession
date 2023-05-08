package com.binary.tree.string;

public class ReverseAString {

    public static String reverseWord(String str) {
        // Reverse the string str
        String s = "";
        for (int i=str.length()-1; i>=0;i--){
            char ch = str.charAt(i);
            s = s+ch;
        }
        return s;
    }

    public static void main(String[] args) {
        String ispar = "Geeks";
        reverseWord(ispar);
    }
}
