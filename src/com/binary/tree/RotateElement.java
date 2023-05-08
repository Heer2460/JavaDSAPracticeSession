package com.binary.tree;

public class RotateElement {

    public static void rotateElement(int[] arr, int k){
        int len = arr.length;
        int dix = 0;
        int[] temp = new int[len];
        for (int i=len-k; i<len; i++){
            temp[dix++] = arr[i];
        }
        for (int j = 0; j<len-k; j++){
            temp[dix++] = arr[j];
        }
    }

    public static void main(String[] args){

        int[] arr = {1,2,3,4,7,8,9};
        int k =3;
        rotateElement(arr,k);
    }
}
