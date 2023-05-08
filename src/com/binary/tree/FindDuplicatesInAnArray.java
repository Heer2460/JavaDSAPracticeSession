package com.binary.tree;

public class FindDuplicatesInAnArray {

    public static void findDuplicatesInAnArray(int[] arr, int size){

        for (int i=0; i<size; i++){
            for (int j = i+1; j<size; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate Elements are : " + arr[i]);
                }
            }
        }
    }

    public static void main(String[] args){

        int[] arr = {2,3,1,2,3};
        int size = arr.length;
        findDuplicatesInAnArray(arr,size);
    }
}
