package com.binary.tree;

import java.util.Arrays;

public class FindTripletsWithZeroSum {

    public static boolean findTriplets(int arr[] , int n) {
        //add code here.
        Arrays.sort(arr);
        for(int i = 0;i<n-2;i++){
            int left = i+1;
            int right = n-1;

            while(left<right){
                int sum = arr[i] + arr[left] + arr[right];
                System.out.println(arr[i]);
                System.out.println(arr[left]);
                System.out.println(arr[right]);
                if(sum == 0){
                    System.out.println(true);
                    return true;
                }
                else if(sum<0){
                    left ++;
                }
                else{
                    right --;
                }
            }
        }
        return false;

        }


    public static void main(String[] args){

       int arr[] = {0, -1, 2, -3, 1};
       int n = arr.length;
       findTriplets(arr,n);
    }
}
