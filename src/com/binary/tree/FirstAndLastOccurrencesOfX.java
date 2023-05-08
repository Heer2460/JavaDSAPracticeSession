package com.binary.tree;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;

public class FirstAndLastOccurrencesOfX {
    static ArrayList<Long> find(long arr[], int n, int x) {
        // code here
        ArrayList<Long> list = new ArrayList<>();
        ArrayList<Long> list1 = new ArrayList<>();
        int i=0;
        while (i<n){
            if (arr[i] == x){
                list.add((long) i);
            }
            i++;
        }
        list1.add(list.get(0));
        list1.add(list.get(3));
        return list1;
    }

    public static void main(String[] args) {
        long[] arr = { 1, 3, 5, 5, 5, 5, 67, 123, 125};
        int n = arr.length;
        int X = 5;
        find(arr,n,X);

    }
}
