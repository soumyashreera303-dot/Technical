package com.cs_is.oops.pillars.Abstraction.Interface100NotAbstract;
//Why interfaces are not 100% abstract
public interface Demo {
    void show(); //Abstract method

    default void display(){
        System.out.println("Default Method!");
    }
    static void message(){
        System.out.println("Static Method");
    }
}

class Driver{
    public static void main(String[] args) {
        Demo.message();
    }
}
