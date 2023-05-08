package com.binary.tree;

public class MaximumIndex {
    static int maxIndexDiff(int[] arr, int n) {

        int diff =0;
        for (int i=0; i<n; i++){
            int j = n-1;
            while (i<=j){
                if (arr[i] <= arr[j]){
                    diff = Math.max(diff,j-i);
                }
                j--;
            }
        }
        System.out.println(diff);
        return diff;
    }
        public static void main(String[] args) {
        int[] arr1 = {34, 8, 10, 3, 2, 80, 30, 33, 1};
        int n = arr1.length;
        maxIndexDiff(arr1,n);
    }
}
