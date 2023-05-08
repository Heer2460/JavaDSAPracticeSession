package com.binary.tree;

import java.util.Arrays;

public class RepeatingNumber {

    public static void main(String[] args){

        int[] arr = {1,2,3,3,4,5,4,5,6,7,8,7,8,9,9};

        int reap = 0;
        int j = 0;
        int len = arr.length;

        int[] temp = new int[arr.length];

        Arrays.sort(arr);
        for (int i = 0; i<arr.length-1; i++){
            if (arr[i] == arr[i+1]){
                temp[j++] = arr[i];
                System.out.println("Duplicate Number "+arr[i]);
            }
        }
//        for (int i = 0; i<temp.length; i++){
//            System.out.println(temp[i]);
//        }
    }
}
