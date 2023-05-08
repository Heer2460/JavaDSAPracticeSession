package com.binary.tree;

import java.util.Stack;

public class RedundantParenthesis {

    static boolean checkRedundancy(String s) {
        // create a stack of characters
        Stack<Character> st = new Stack<>();
        char[] str = s.toCharArray();
        // Iterate through the given expression
        for (char ch : str){
            if (ch == ')'){
             char top =  st.peek();
                st.pop();
                boolean flag = true;

                while (top!='('){

                    if (top =='+'||top=='-'||top=='/'||top=='*'){
                        flag = false;
                    }
                  top=  st.peek();
                    st.pop();
                }
                if (flag){
                    return true;
                }

            }else {
                st.push(ch);
            }
        }
        return false;
    }

    static void findRedundant(String str) {
        boolean ans = checkRedundancy(str);
        if (ans == true) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static void main(String[] args) {
        String str = "((B+C))";
        findRedundant(str);

    }
}
