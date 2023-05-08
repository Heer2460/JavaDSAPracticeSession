package com.binary.tree;

public class MinimumNumberOfJumps {

    static int minJumps(int[] arr){
        // your code here
        int jumps=0;
        int curMax=0;
        int curReach=0;

        for(int i=0; i<arr.length-1; i++){
            if(i+arr[i]>curMax){
                curMax = i+arr[i];
            }
            if(i==curReach){
                jumps++;
                curReach=curMax;
            }
        }
        System.out.println(jumps);
        return jumps;

    }

    public static void main(String[] args){
        int[] arr = {1, 4, 3, 2, 6, 7};
        minJumps(arr);
    }
}
