package com.binary.tree;

public class SortAnArrayOf0s1sAnd2s {

    public static void sort012(int array[], int n){
        int countzero = 0 ;
        int countone = 0 ;
        int counttwo = 0 ;

        int i = 0 ;
        while ( i < n ) {
            if ( array [ i ] == 0 ) {
                countzero++;
            }
            if ( array[ i ] == 1 ) {
                countone++;
            }
            if ( array[ i ] == 2 ) {
                counttwo++;
            }
            i++;
        }
        i = 0 ;
        int idx =0;
        while ( i < countzero ) {
            array[idx++] = 0 ;
            i++;
        }
        int j=0;
        while ( j < countone) {
            array[idx++] = 1 ;
            j++;
        }
        int k =0;
        while ( k < counttwo) {
            array[idx++] = 2 ;
            k++;
        }
    }

    public static void main(String[] args){
        int[] arr = {0, 2, 1, 2, 0};
        int n = arr.length;
        sort012(arr,n);
    }
}
