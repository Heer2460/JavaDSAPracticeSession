package com.binary.tree;

public class SumOfSeries {
    static long seriesSum(int n) {
        // code here
        int i=0;
        long sum =0;
        while (i<=n){
            sum += i;
            i++;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n =5;//1+2+3+4+5=15
        seriesSum(n);
    }

}
