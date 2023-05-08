package com.binary.tree.string;

public class ReverseWordsInGivenString {
    //Function to reverse words in a given string.
    static String reverseWords(String S) {
        // code here
        String str [] =S.split("[.]");
        String st="";
        for(int i=str.length-1;i>=0;i--){
            st = st+str[i] + "." ;
        }
        System.out.println(st.substring(0,st.length()-1));
        return st;
    }

    public static void main(String[] args) {

        String str = "i.like.this.program.very.much";
        reverseWords(str);
    }
}
