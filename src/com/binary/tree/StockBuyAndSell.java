package com.binary.tree;

import java.util.ArrayList;

public class StockBuyAndSell {

   static ArrayList<ArrayList<Integer> > stockBuySell(int A[], int n) {
        // code here

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        if(n == 1){
            return ans;
        }
        int i =0;
        while(i < n-1){
            while(i < n-1 && A[i]>=A[i+1]){
                i++;
            }
            if(i == n-1){
                break;
            }
            int buy = i++;
            while(i<n && A[i]>=A[i-1]){
                i++;
            }
            int sell = i-1;
            ArrayList<Integer> pair = new ArrayList<>();
            pair.add(buy);
            pair.add(sell);
            ans.add(pair);
        }
        System.out.println(ans+" ");
        return ans;
    }

    public static void stockBuyAndSell(int[] arr, int n){
        ArrayList<Integer> ans = new ArrayList<>();
        if (n==1){
            return;
        }
        for (int i=0; i<n; i++){
            for (int j = i+1; j<n; j++){
                if (arr[j]<arr[i]){
                    System.out.println(1);
                    return;
                }
            }
        }
    }

    public static void main(String[] args){
        int[] arr = {100,180,260,310,40,535,695};
        int n = arr.length-1;
        stockBuySell(arr,n);
    //    secondLargest(arr,size);
    }
}
