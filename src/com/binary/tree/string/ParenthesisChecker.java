package com.binary.tree.string;

import java.util.Stack;

public class ParenthesisChecker {

    //Function to check if brackets are balanced or not.
    static boolean ispar(String str){
            // add your code here
            int c=0;
            Stack<Character> sc = new Stack<>();
            for(int i=0;i<str.length();i++){
                char ch=str.charAt(i);
                if(ch=='(' || ch=='[' || ch=='{'){
                    sc.push(ch);
                }else if(sc.isEmpty()){
                    return false;
                } else if(sc.peek()=='(' && ch==')'){
                    sc.pop();
                }else if(sc.peek()=='[' && ch==']'){
                    sc.pop();
                }else if(sc.peek()=='{' && ch=='}'){
                    sc.pop();
                } else{
                    c=1;
                }
            }if(c==1){
                return false;
            }if(sc.isEmpty()){
                return true;
            }
            return false;
    }

    public static void main(String[] args) {

        String ispar = "{([])}";
        ispar(ispar);
    }
}
