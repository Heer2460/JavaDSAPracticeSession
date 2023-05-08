package com.binary.tree;

public class FactorialsOfLargeNumbers {
    static void factorial(int N){
        //code here
        int i=1;
        int fac=1;
        while (i<=N){
             fac *=i;
             i++;
        }
        System.out.println(fac);
    }
    public static void main(String[] args) {
       int n =10;
        factorial(n);
    }
}
