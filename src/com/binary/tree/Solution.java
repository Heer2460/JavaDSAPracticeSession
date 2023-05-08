package com.binary.tree;

class Solution {
    static int MissingNumber(int array[], int n) {
        // Your Code Here
        int sum = ((n+1)*(n+2))/2;
        int counter;
        for(int i=0; i<n; i++){
            sum -= array[i];
        }
        return sum;
    }
    public static void main(String[] args)
    {
        int[] arr = {6,1,2,8,3,4,7,10,5};
        int n = arr.length;
        System.out.println(MissingNumber(arr, n));
    }
}