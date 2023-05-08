package com.binary.tree;

public class IntersectionOfTwoArrays {
    // Function to return the count of the number of elements in
    // the intersection of two arrays.
    public static int numberofElementsInIntersection(int arr1[], int arr2[], int n, int m) {
        // Your code here

        int counter=0;
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                if (arr2[i] ==arr1[j]){
                    counter++;
                }
            }
        }
        System.out.println(counter);
        return counter;
    }

    public static void main(String[] args) {

        int[] arr1 = {89, 24, 75, 11, 23};
        int[] arr2 = {89, 2, 4};
        int n = arr1.length;
        int m =arr2.length;
        numberofElementsInIntersection(arr1,arr2,n,m);
    }
}
