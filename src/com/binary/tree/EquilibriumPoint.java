package com.binary.tree;

public class EquilibriumPoint {

    public static void equilibriumPoint(int[] arr, int size){
        if (size == 1 || size ==0){
            return;
        }

        for (int i=0; i<size; i++){
            if (arr[i] + arr[i+1] == arr[i+3] + arr[i+4]){
                System.out.println(arr[2]);
            }
        }
    }

    public static void main(String[] args){
      //  int[] arr = {1,3,5,2,2};
        int[] arr1 = {1};
        int size = arr1.length;
        equilibriumPoint(arr1,size);
    }
}
