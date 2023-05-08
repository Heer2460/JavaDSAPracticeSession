package com.binary.tree;

import java.util.ArrayList;
import java.util.Arrays;

public class MaximumOfAllSubArraysOfSizeK {
    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
        ArrayList<Integer> result = new ArrayList<Integer>();

        for (int i = 0; i <= n - k; i++) {
            int max = arr[i];
            for (int j = i + 1; j < i + k; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                }
            }
            result.add(max);

        }
        System.out.println(result);
        return result;
    }

    public static void main(String[] args){
        int[] arr = {8,5,10,7,9,4,15,12,90,13};
        int N = 10, K = 4;
        max_of_subarrays(arr,N,K);

    }
}
