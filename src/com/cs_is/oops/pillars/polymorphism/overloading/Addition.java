package com.cs_is.oops.pillars.polymorphism.overloading;

public class Addition {
    static void add(int a, int b){
        System.out.println("Integer");
        System.out.println(a+b);
    }
    static void add(int a, int b, int c){
        System.out.println("Integer");
        System.out.println(a+b+c);
    }
    static void add(float a, float b){
        System.out.println("Float");
        System.out.println(a+b);
    }
    static void add(double a, double b){
        System.out.println("Double");
        System.out.println(a+b);
    }
    public static void main(String[] args){
    add(1,2);
        add(1,2,3);
        add(1.2f,2.3f);
        add(1.234,2.4321);
    }
}
