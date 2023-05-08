package com.binary.tree;

public class WaveArray {

    public static void convertToWave(int[] a,int n) {
        // code here
        int i =0;
        int[] temp = new int[a.length];
        int idx = 0;
        int left =0;
        int right=0;
        while (i<n){
            if (i%2 ==0 || i==0){
                if (left==4){
                    temp[idx++] = a[left++];
                    break;
                }
                temp[idx++] = a[left+1];
                left +=2;
                i++;
            }else {
                temp[idx++] = a[right];
                right+=2;
                i++;
            }
        }
        for (int l =0;l<temp.length;l++){
            System.out.print(temp[l]+" ");
        }

        }


    public static void main(String[] args){

        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        convertToWave(arr,n);
    }
}
