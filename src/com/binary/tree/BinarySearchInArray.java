package com.binary.tree;

public class BinarySearchInArray {

    public static void binarySearchInArray(int[] arr,int size, int k){

        for (int i=0; i<size; i++){
            if (i == k){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args){
        int[] arr ={1,2,3,4,5};
        int size = arr.length;
        int k = 4;
        binarySearchInArray(arr,size,k);
    }
}
