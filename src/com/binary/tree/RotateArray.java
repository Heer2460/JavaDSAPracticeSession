package com.binary.tree;

public class RotateArray {

    static void rotateArr(int arr[], int k, int n){
        // add your code here
        int[] temp = new int[arr.length];
        int idx =0;
        for (int i=n-k; i<arr.length; i++){
            temp[idx++] = arr[i];
        }
        int y =0;
        while (y<n-k){
            temp[idx++] = arr[y];
            y++;
        }

//        for (int j = 0; j<n-k; j++){
//            temp[idx++] = arr[j];
//        }
        for (int l=0; l<temp.length; l++) {
            System.out.print(temp[l]+" ");
        }
    }

    public static void main(String[] args){

        int arr[] = {1,2,3,4,5};
        int n = arr.length-1;
        int k =2;
        rotateArr(arr,k,n);

    }
}
