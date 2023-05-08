package com.binary.tree;

import java.util.Arrays;

public class KthSmallestElement {

    public static void kthSmallestElement(int[] arr, int size, int k){

        Arrays.sort(arr);
        for(int i=0; i<size; i++){
            if (i == k){
                System.out.println(arr[i-1]);
            }
        }
    }

    public static void main(String[] args){
        int[] arr = {7,10,4,3,20,15};
        int[] arr1={7,10,4,20,15};
        int size = arr.length-1;
        int K = 4;
        kthSmallestElement(arr1,size,K);
    }
}
