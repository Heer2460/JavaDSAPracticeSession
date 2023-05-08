package com.binary.tree;

class Service {
    boolean compare(String str1, String str2) {
        return str1 == str2;
    }

    public static void main(String[] args) {
        String str1 = "a";
        String str2 = new String("a");
        System.out.println(new Service().compare(str1, str2));
    }
}