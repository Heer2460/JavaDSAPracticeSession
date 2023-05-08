package com.binary.tree;

import java.util.Arrays;

public class MinimizeTheHeightsII {

    public static void minimizeTheHeightsII(int[] arr, int size, int k){

        int temp[] = new int[arr.length];
        int count =0;
        int idx =0;
        while (count<size) {
           if (count==0){
               temp[idx++] = arr[count]+k;
           }else {
               temp[idx++] = arr[count]-k;
           }
           count++;
        }
        System.out.println(temp[temp.length-1]-temp[0]);
    }

    public static void main(String[] args){
        int[] arr = {1, 5, 8, 10};
        int size = arr.length;
        int k = 2;
        minimizeTheHeightsII(arr,size,k);

    }
}
