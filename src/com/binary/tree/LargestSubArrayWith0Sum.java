package com.binary.tree;

public class LargestSubArrayWith0Sum {

    static int maxLen(int arr[], int n) {
        // Your code here
        int i=0;
        int sum =0;
        while (i<n-1){
            i++;
            sum+= arr[i];
            if (sum == 0){
                System.out.println(i);
            }
        }
        return i;
    }

    public static void main(String[] args){
        int[] arr = {15,-2,2,-8,1,7,10,23};
        int n = arr.length;
        maxLen(arr,n);

    }
}
