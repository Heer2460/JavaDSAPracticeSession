package com.binary.tree;

public class MaximumProductSubArray {

    static long maximumProductSubArray(int[] arr, int n){
        long sum=1;
        long max=arr[0];
        for(int i=0;i<n;i++){
            sum*=arr[i];
            max=Math.max(sum,max);
            if(arr[i]==0)
                sum=1;
        }
        sum=1;
        for(int i=n-1;i>=0;i--){
            sum*=arr[i];
            max=Math.max(sum,max);
            if(arr[i]==0)
                sum=1;
        }
        System.out.println(max);
        return max;

//        int max=1;
//        for (int i=0; i<=3; i++){
//            if (arr[i] !=0 || arr[i] != -1) {
//                max *= arr[i];
//            }else {
//                return;
//            }
//        }
//        System.out.println(max);
    }


    public static void main(String[] args){
        int[] arr = {2, 3, 4, 5, -1, 0};
        int size = arr.length;
        maximumProductSubArray(arr,size);
}
}
