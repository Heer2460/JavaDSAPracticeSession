package com.binary.tree;

public class MaxSubArraySum {
    static void maxSubarraySum(int arr[], int n){
        // Your code here
        int sum =0;
        for (int i=0; i<n; i++){
             sum += arr[i];
        }
        System.out.println(sum);
    }
    public static void main(String[] args){
        int[] arr = {-1,-2,-3,-4};
        int n = arr.length;
        maxSubarraySum(arr,n);
    }
}
