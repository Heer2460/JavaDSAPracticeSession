package com.binary.tree;

import java.util.ArrayList;
import java.util.List;

public class FindContinuousSubArray {

    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr,int num,int sum) {
        // Your code here
        List<Integer> list = new ArrayList<Integer>();

        for (int i =0; i<num; i++){
            int currentSum = arr[i];
            if (currentSum==sum){
                list.add(i);
                System.out.println("Sum found in :"+i);
                return (ArrayList<Integer>) list;
            }else {
                for (int j = i+1; j<num; j++){
                    currentSum += arr[j];
                    if (currentSum ==sum){
                        System.out.println("Sum found in" +i+ "and" +j);
                        list.add(i+1);
                        list.add(j+1);
                        return (ArrayList<Integer>) list;
                    }
                }
            }
        }
        return (ArrayList<Integer>) list;
    }



    public static void main(String[] args){
      // int[] arr = {1,2,3,7,5};
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
       int sum = 15;
       int n= arr.length;
       subarraySum(arr,n,sum);
    }
}
