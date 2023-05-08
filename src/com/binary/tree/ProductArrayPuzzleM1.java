package com.binary.tree;

public class ProductArrayPuzzleM1 {

    public static long[] productExceptSelf(int nums[], int n) {
        // code here
        long[] arr = new long[n];
        int i=0;
        int idx = 0;
        int total = 1;
        int j=0;
        while (i<n){
            total *= nums[i];
            i++;
        }
        while (j<n){
            arr[idx++] =total/nums[j];
            j++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {10, 3, 5, 6, 2};
        int n = arr.length;
        productExceptSelf(arr,n);

    }
}
