package com.binary.tree;

import java.util.Arrays;

public class KTheElementOfTwoSortedArrays {

    public static long kthElement( int arr1[], int arr2[], int n, int m, int k) {

        int idx =0;
        int[] temp = new int[n+m];
        for (int i=0; i<n; i++){
            temp[idx++] = arr1[i];
        }
        for (int i=0; i<m; i++){
            temp[idx++]=arr2[i];
        }
        int j=1;
        Arrays.sort(temp);
        while (j<temp.length){
            if (j == k-1){
                System.out.println(temp[j]);
                return temp[j];
            }
            j++;
        }
        return temp[j];
    }

    public static void main(String[] args) {

        int arr1[] = {2, 3, 6, 7, 9};
        int arr2[] = {1, 4, 8, 10};
        int n = arr1.length;
        int m = arr2.length;
        int k = 5;
        kthElement(arr1,arr2,n,m,k);
    }
}
