package com.Arrays;



public class RotateArray {

    public static void rotateArray(int[] arr, int k, int n){
        int idx =0;
        int[] temp = new int[n];
        for (int i=k; i<n; i++){
            temp[idx++] = arr[i];
        }
        for (int j=0; j<k;j++){
            temp[idx++] = arr[j];
        }

    }
    public static void main(String args[]) {

        int[] arr = {1,2,3,4,5};
        int k = 2;
        int n = arr.length;
        rotateArray(arr,k,n);

    }
}
