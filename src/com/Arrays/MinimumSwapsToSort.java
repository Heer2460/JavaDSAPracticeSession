package com.Arrays;

import java.util.Arrays;

public class MinimumSwapsToSort {

    public static int minSwaps(int nums[]) {
        int count = 0;
        int temp = 0;
        for(int i=0; i<nums.length-1;i++){
        int min_index = i;
        for (int j=i+1;j<nums.length;j++) {

            if (nums[j] < nums[min_index])
                min_index = j;
        }

        if (min_index != i) {
            temp = nums[i];
            nums[i]=nums[min_index];
            nums[min_index] = temp;
            count ++;
        }
    }
//        System.out.println("Original Array"+ Arrays.toString(nums));
//
//        for (int i=0;i<nums.length-1; i++){
//            if (nums[i]>nums[i+1]){
//                temp = nums[i];
//                nums[i]=nums[i+1];
//                nums[i+1]=temp;
//                i =-1;
//            }
//        }
//        System.out.println("Sorted  Array"+ Arrays.toString(nums));
        System.out.println(count);
        return count;
    }

    public static void main(String args[]) {
        int[] arr = {10, 19, 6, 3, 5};
        minSwaps(arr);
    }
}
