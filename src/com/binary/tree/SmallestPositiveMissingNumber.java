package com.binary.tree;

public class SmallestPositiveMissingNumber {

    static int missingNumber(int arr[], int size) {
        // Your code here
        int sum = ((size+1)*(size+2))/2;
        int total = 0;
        for (int i=0; i<size; i++){
            total += arr[i];
        }
        System.out.println(sum-total);
        return sum-total;
    }
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5};
        int n =6;
        int k = 5;
        missingNumber(arr,k);
    }
}
