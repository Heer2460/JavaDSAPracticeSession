package com.binary.tree;

public class SearchAnElementInAnArray {

    static int search(int arr[], int N, int X){

        // Your code here
        int search = 0;
        for(int i=0;i<N; i++){
            if(arr[i] == X){
                search = i;
            }
        }
        System.out.println(search);
        return search;

    }

    public static void main(String[] args){
        int arr[] = {1,2,3,4,5};
        int n =5;
        int x = 5;
        search(arr,n,x);

    }
}
