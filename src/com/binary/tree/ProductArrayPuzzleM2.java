package com.binary.tree;

public class ProductArrayPuzzleM2 {

    public static long[] productExceptSelf(int nums[], int n) {
        // code here
        long[] left = new long[n];
        long[] right = new long[n];
        long[] arr = new long[n];
        left[0] = 1;
        right[n-1]=1;
        for (int i=1; i<n; i++){
            left[i] = left[i-1] * nums[i-1];
        }
        for (int j=n-2; j>=0; j--){
            right[j] = right[j+1]* nums[j+1];
        }
        for (int l =0; l<n; l++){
            arr[l] = (int) (left[l]*right[l]);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {10, 3, 5, 6, 2};
        int n = arr.length;
        productExceptSelf(arr,n);

    }
}
