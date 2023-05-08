package com.binary.tree.string;

public class StringSortingProb {


    static int count(String str){
        String temp ="abcd";
        int i=0;
        int result =0;
        while (i<str.length()){
            char ch = str.charAt(i);
            char ch1=temp.charAt(i);
            if (ch1 != ch){
                result++;
            }
            i++;
        }
       return result;
    }

    public static void main(String[] args){
        String str ="cabd";
        count(str);
    }
}
