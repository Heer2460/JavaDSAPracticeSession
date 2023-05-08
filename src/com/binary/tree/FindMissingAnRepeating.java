package com.binary.tree;

public class FindMissingAnRepeating {
    static void findMissingAnRepeating(int[] arr, int size){
        int sum = ((size+1)*(size+2))/2;
        int total =0;
        for (int i=0; i<size; i++){
            total +=arr[i];
//            if (arr[i] == arr[i+1]){
//                System.out.println("Repating Number: "+arr[i]);
//            }
        }
        int missingNumber = sum-total;
        System.out.println(missingNumber);

    }

    public static void main(String[] args){
        int[] arr = {1, 3, 3};
        int size = 2;
        findMissingAnRepeating(arr,size);
    }
}
