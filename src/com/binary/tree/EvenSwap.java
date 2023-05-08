package com.binary.tree;

public class EvenSwap {

    public static void evenSwap(int[] arr,int n){

        int[] temp = new int[n];
        int idx = 0;
        for (int i=arr.length-1; i<=arr.length-1; i--){
            if (i != -1){
            temp[idx++] = arr[i];
            System.out.print(arr[i]+" ");
            }else {
                return;
            }
        }
    }
    public static void main(String[] args){

        int[] arr = {1,3,5};
        int n = arr.length;
        evenSwap(arr,n);
    }
}
