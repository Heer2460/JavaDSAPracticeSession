package com.binary.tree;

enum Type { A, B, C }

class Handler {
    void handle(Type type) {
        switch (type) {
            case A:
                System.out.println("A"); break;

        }
    }
    public static void main(String[] args) {
        new Handler().handle(Type.B);
        new Handler().handle(Type.C);
    }
}