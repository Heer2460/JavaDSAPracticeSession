package com.binary.tree;

public class LongestSubArrayWithSumK {

    // Function for finding maximum and value pair
    public static int lenOfLongSubarr (int arr[], int n, int k) {
        //Complete the function

        int maxlength = 0;
        for (int i=0; i<n; i++){
            int sum =0;
            for (int j=i; j<n; j++){
                sum+= arr[j];
                if (sum==k){
                    maxlength = Math.max(maxlength, j - i + 1);
                }
            }
        }
        return maxlength;
    }

    public static void main(String[] args) {
        int[] arr= {10, 5, 2, 7, 1, 9};
        int n = arr.length-1;
        int k=15;
        lenOfLongSubarr(arr,n,k);
    }
}
