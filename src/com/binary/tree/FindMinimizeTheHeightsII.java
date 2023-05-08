package com.binary.tree;

public class FindMinimizeTheHeightsII {

    public static void findMinimizeTheHeightsII(int[] arr, int size, int k) {
        int[] temp = new int[arr.length];
        for (int i=0; i<size; i++){
            if (i<k){
                temp[i] = arr[i]+k;
            }else if (i>=k){
                temp[i] = arr[i]-k;
            }
        }

        int minHeight = temp.length-1;

        for (int j = 0; j<=minHeight; j++){
            if (minHeight == j){
                System.out.println(temp[temp.length-1]-temp[0]);
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 10};
        int size = arr.length;
        int k = 2;
        findMinimizeTheHeightsII(arr, size, k);
    }
}
