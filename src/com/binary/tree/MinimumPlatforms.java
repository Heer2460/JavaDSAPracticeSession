package com.binary.tree;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MinimumPlatforms {

    public static void minimumPlatforms(int[] arr, int[] dep, int n){

        Arrays.sort(arr);
        Arrays.sort(dep);
        int count =0;
        int ans = 0;
        int i=0;
        int j=0;

        while (i<n){
            if (arr[i] <=dep[j]){
                count++;
                ans = Math.max(ans,count);
                i++;
            }else if(arr[i] > dep[j]){
                count--;
                j++;
            }
        }
        System.out.println(ans);
    }


    public static void main(String[] args){
        int[] arr = {900, 940, 950, 1100, 1500, 1800};
        int[] dep = {910, 1200, 1120, 1130, 1900, 2000};
        int n =6;
        minimumPlatforms(arr,dep,n);
    }
}
