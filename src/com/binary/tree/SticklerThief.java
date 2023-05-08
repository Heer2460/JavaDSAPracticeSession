package com.binary.tree;

public class SticklerThief {
    static int findMaxSum(int arr[], int n) {
        // Your code here
        int sum =0;
        for (int i=1; i<n; i = i+2){
            sum += arr[i];
        }
        System.out.println(sum);
        return sum;

    }

    public static void main(String[] args) {
        int[] arr= {5,5,10,100,10,5};
        int n = arr.length;
        findMaxSum(arr,n);

    }
}
