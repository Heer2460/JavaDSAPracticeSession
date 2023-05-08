package com.binary.tree;

public class MajorityElement {

    public static void majorityElement(int[] arr,int size){
        for (int i=0; i<size; i++){
            if (arr[i] == arr[i+1]){
                System.out.println("Repeated element is :"+arr[i]);
            }
        }
    }

    public static void main(String[] args){
        int[] arr = {3,1,3,3,2};
        int size = arr.length-1;
        majorityElement(arr,size);

    }
}
