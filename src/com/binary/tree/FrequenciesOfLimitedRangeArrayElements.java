package com.binary.tree;

import java.util.HashMap;

public class FrequenciesOfLimitedRangeArrayElements {

    public static void frequencyCount(int arr[], int N, int P){

        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i=0; i<N; i++){
            if (map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else {
                map.put(arr[i],1);
            }
        }
        for (int i=1; i<N+1; i++){
            if (map.containsKey(i)){
                arr[i-1] = map.get(i);
            }else {
                arr[i-1] =0;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 3, 5};
        int n = arr.length;
        int P = 5;
        frequencyCount(arr,n,P);

    }
}
