package com.binary.tree;

public class TrappingRainWater {
    static long trappingWater(int arr[], int n) {
        // Your code here
        int pMax[] = new int[n];
        pMax[0] = arr[0];
        for(int i = 1; i < n; i++) {
            pMax[i] = Math.max(pMax[i-1], arr[i]);
        }
        int sMax[] = new int[n];
        sMax[n-1] = arr[n-1];
        for(int i = n-2; i >= 0; i--) {
            sMax[i] = Math.max(sMax[i+1], arr[i]);
        }
        long total = 0;
        for(int i = 0; i < n; i++) {
            int currentPillar = arr[i];
            int leftPillar = pMax[i];
            int rightPillar = sMax[i];
            int min = Math.min(leftPillar, rightPillar);
            total += min - currentPillar;
        }
        System.out.println(total);
        return total;
    }

    public static void main(String[] args){
        int[] arr = {3,0,0,2,0,4};
        int size = arr.length;
        trappingWater(arr,size);
    }
}
