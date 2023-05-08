package com.binary.tree;

public class FirstElementToOccurKTimes {
    public static int firstElementKTime(int[] a, int n) {
        int counter =0;
        for (int j=0; j<n; j++) {
            int i=j+1;
            while (i<n-1) {
                if (a[j] == a[i+1]) {
                    System.out.println(j);
                    counter =i;
                }
                i++;
            }
        }
        return counter;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 7, 4, 3, 4, 8, 7};
        int n = arr1.length;
        firstElementKTime(arr1,n);
    }
}
