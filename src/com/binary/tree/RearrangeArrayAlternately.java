package com.binary.tree;

import java.util.Arrays;

public class RearrangeArrayAlternately {

    // temp: input array
    // n: size of array
    //Function to rearrange  the array elements alternately.
    public static void rearrange(long arr[], int n) {

        // Your code here
        Arrays.sort(arr);
        long[] arr1 = new long[n];
        int i = 0;
        int lIndex = 0;
        int rIndex = n - 1;
        while (i < n) {
            if (i % 2 == 0 || i == 0) {
                arr1[i] = arr[rIndex];
                rIndex--;
                i++;
            } else {
                arr1[i] = arr[lIndex];
                lIndex++;
                i++;
            }
        }
        for (i = 0; i < n; i++) {
            arr[i] = arr1[i];
        }
    }
    public static void main(String[] args){
        long[] arr = {1,2,3,4,5,6};
        int n = arr.length;
       rearrange(arr,n);

    }
}
