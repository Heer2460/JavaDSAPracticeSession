package com.java.basics;

import java.util.ArrayList;

public class RotateTheArrayAByBPositions {

    public static ArrayList<Integer> rotateArray(ArrayList<Integer> A, int B) {
        ArrayList<Integer> ret = new ArrayList<Integer>();
        for (int i = 0; i < A.size(); i++) {
            ret.add(A.get(i + B));
        }
        return ret;
    }
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int pos=1;
        rotateArray(list,pos);
    }
}
