package com.binary.tree;

import java.util.Arrays;

public class SortAnArray {

    public static void sortArray(int[] arr, int n){

        Arrays.sort(arr);
        for (int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args){
        int[] arr = {0,1,0,1,2,4,3};
        int n = arr.length;
        sortArray(arr,n);
    }
}
