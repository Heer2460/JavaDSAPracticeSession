package com.binary.tree;

import java.util.Arrays;

public class PythagoreanTriplet {
    static boolean checkTriplet(int[] arr, int n) {
        // code here

        Arrays.sort(arr);
        for (int i=0; i<n; i++){
            for (int j=i+1;j<n; j++){
                for (int k = i+2; k<n; k++){
                    if (arr[i]*arr[i]+arr[j]*arr[j]==arr[k]*arr[k]){
                        System.out.println(arr[i]*arr[i]+arr[j]*arr[j]==arr[k]*arr[k]);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr= {3, 2, 4, 6, 5};
        int n = arr.length;
        checkTriplet(arr,n);
    }
}
