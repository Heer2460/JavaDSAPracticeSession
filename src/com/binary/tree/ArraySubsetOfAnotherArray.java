package com.binary.tree;

public class ArraySubsetOfAnotherArray {

    public static String isSubset( long a1[], long a2[], long n, long m) {
        int i=0;
        String isTrue = " ";
        while (i<m){
            for (int j = 0; j<n-1; j++){
                if (a2[i] == a1[j]){
                    isTrue = "yes";
                }
            }
            i++;
        }
        return isTrue;
    }

    public static void main(String[] args){
        long a1[] = {11, 1, 13, 21, 3, 7};
        long n = a1.length;
        long a2[] = {11, 3, 7, 1};
        long m = a2.length;
        isSubset(a1,a2,n,m);


    }
}
