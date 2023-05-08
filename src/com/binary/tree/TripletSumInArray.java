package com.binary.tree;

import java.util.Arrays;

public class TripletSumInArray {

    //Function to find if there exists a triplet in the
    //array A[] which sums up to X.
    public static boolean find3Numbers(int[] arr, int n, int sum) {
        // Your code Here
     //   Arrays.sort(arr);

        for (int i = 0;i<n; i++){
            int left = i+1;
            int right = n-1;
            int max =0;
            while (left<right){
                max = arr[i]+arr[left]+arr[right];

                if (max == sum){
                    return true;
                }
                if (max<right){
                    left++;
                }
                if (left>right){
                    right--;
                }
            }
        }

        return false;
    }


    public static void main(String[] args){
        int arr[] = {1,4,45,6,10,8};
        int n =6;
        int sum = 13;
        find3Numbers(arr,n,sum);
    }
}
