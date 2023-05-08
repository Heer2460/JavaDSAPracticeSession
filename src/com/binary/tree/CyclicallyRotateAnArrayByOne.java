package com.binary.tree;

public class CyclicallyRotateAnArrayByOne {
    public static void rotate(int arr[], int n) {

        int[] temp = new int[arr.length];
        int idx = 0;
        for (int i=n-1; i<n; i++){
            temp[idx++] = arr[i];
        }
        int j =0;
        while (j<n-1){
            temp[idx++]=arr[j];
            j++;
        }
    }

    public static void main(String[] args){
        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;
        rotate(arr,n);

    }
}
