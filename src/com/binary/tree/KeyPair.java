package com.binary.tree;

//Given an array Arr of N positive integers and another number X.
// Determine whether or not there exist two elements in Arr whose sum is exactly X.
public class KeyPair {

    static boolean hasArrayTwoCandidates(int arr[], int n, int x) {
        // code here
        int i=0;
        int sum =0;
        boolean flag = false;
        while (i<n){
            sum = arr[i]+arr[i+1];
            if (sum == x){
                return true;
            }
            i++;
        }
        return false;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 3, 5, 5, 5, 5, 67, 123, 125 };
        int n = arr.length;
        int X = 5;
        hasArrayTwoCandidates(arr,n,X);
    }
}
