package com.binary.tree;

public class MakeArrayElementsEqual {

    public static long minOperations(int N) {
        // Code here
        long ans;
        long n=N/2;

        if(N%2==1){
            ans=n*(n+1);
        }
        else{
            ans=n*n;
        }
        System.out.println(ans);
        return ans;
    }

    public static void main(String[] args){

        int N = 3;
        minOperations(N);
    }
}
