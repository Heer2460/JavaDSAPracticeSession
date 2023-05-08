package com.interfaces.com;

public interface Animal {
    public void bark();
}
 interface Dog {
     public void bark();
}

class Crearor implements Animal,Dog{

    @Override
    public void bark() {
        System.out.println("Method override");
    }
}

class Main{
    public static void main(String[] args) {

        Crearor crearor = new Crearor();
        crearor.bark();
    }
}
