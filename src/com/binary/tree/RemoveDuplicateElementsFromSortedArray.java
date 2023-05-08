package com.binary.tree;

public class RemoveDuplicateElementsFromSortedArray {

    static int remove_duplicate(int arr[],int n){
        int i=0;
        int j=1;
        int[] temp = new int[n];
        while (j<n){
            if (arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
            j++;
        }
        System.out.println(arr[i]);
        return i;
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 3, 4};
        int n = arr.length;
        remove_duplicate(arr,n);
    }
}
