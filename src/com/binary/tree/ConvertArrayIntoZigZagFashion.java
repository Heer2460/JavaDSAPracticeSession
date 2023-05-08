package com.binary.tree;

public class ConvertArrayIntoZigZagFashion {
    public static void zigZag(int[] arr, int n){
        // Code your solution here.
        for (int i=0;i<n; i++){
            if (i%2==0 && arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] =arr[i+1];
                arr[i+1] = temp;
            }else if (i%2==1 && arr[i]<arr[i+1]){
                int temp = arr[i];
                arr[i] =arr[i+1];
                arr[i+1] = temp;
            }
        }
    }
        public static void main(String[] args) {
            int[] arr= {4, 3, 7, 8, 6, 2, 1};
            int n = arr.length-1;
            zigZag(arr,n);
    }

}
