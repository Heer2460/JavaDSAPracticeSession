package com.binary.tree;

public class CountInversions {

    public static void countInversions(int[] arr, int size){

        int countInv =0;
        for (int i =0; i<size; i++){
            for (int j= i+1; j<size; j++){
                if (arr[i] > arr[j])
                    countInv++;
            }
        }
        System.out.println(countInv);

    }

    public static void main(String[] args){

        int[] arr = {10, 10, 10};
         //       {2, 4, 1, 3, 5};
        int size = arr.length;
        countInversions(arr,size);

    }
}
