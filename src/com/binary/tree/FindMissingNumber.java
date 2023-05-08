package com.binary.tree;

public class FindMissingNumber {

    public static void missingNumber(int[] arr, int n){
        int sum = ((n+1)*(n+2))/2;

        int total =0;

        for (int i=0; i<n; i++) {
            total += arr[i];
        }
        System.out.println(sum-total);
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,5};
        int n = arr.length;
        missingNumber(arr,n);
    }
}
