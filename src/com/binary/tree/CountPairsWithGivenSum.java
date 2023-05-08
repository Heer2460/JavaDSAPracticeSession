package com.binary.tree;

public class CountPairsWithGivenSum {

    public static void countPairsWithGivenSum(int[] arr, int size, int k){

        int counter =0;
        for (int i=0;i<size; i++){

            for (int j = i+1; j<size; j++){
                if (arr[i]+arr[j] ==k){
                    System.out.println("Sum is eqal");
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }


    public static void main(String[] args){
        int arr[] = {1, 5, 7, 1};
        int size = arr.length;
        int k = 6;
        countPairsWithGivenSum(arr,size,k);

    }
}
