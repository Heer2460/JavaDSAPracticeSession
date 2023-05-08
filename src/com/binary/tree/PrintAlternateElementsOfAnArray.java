package com.binary.tree;

public class PrintAlternateElementsOfAnArray {

    public static void print(int arr[], int n) {
        // your code here
        int i=0;
        int[] temp = new int[3];
        int idx =0;
        while (i<n){
            temp[idx++] = arr[i];
            i =i+2;
        }
    }

    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4};
        int size = arr.length;
        print(arr,size);

    }
}
