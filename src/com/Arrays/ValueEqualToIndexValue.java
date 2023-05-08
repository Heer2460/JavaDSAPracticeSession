package com.Arrays;

import java.util.ArrayList;

public class ValueEqualToIndexValue {

   static ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        // code here
       ArrayList<Integer> list = new ArrayList<>();
       for (int i=0; i<n; i++){
           if (i+1==arr[i]){
               list.add(arr[i]);
           }
       }
       return list;
    }

    public static void main(String args[]) {

        int[] arr = {15, 2, 45, 12, 7};
        int n = arr.length;
        valueEqualToIndex(arr,n);

    }
}
