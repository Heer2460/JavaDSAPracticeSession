package com.binary.tree;

import java.util.Arrays;

public class SecondLargest {

    static void secondLargest(int[] arr, int size){

        Arrays.sort(arr);
        int second = arr.length-2;
        System.out.println(arr[second]);
    }

    public static void main(String[] args){
        int[] arr = {100,180,260,310,40,535,695};
        int size = arr.length;
        secondLargest(arr,size);
    }
}
