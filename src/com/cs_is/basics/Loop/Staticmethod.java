package com.cs_is.basics.Loop;

public class Staticmethod {
    static int x =200;
    static void display(){
        System.out.println("SNPSU_CS_IS");
    }
}
class StaticDemo{
    public static void main(String[] args) {
        // Use Classname to access static data from other class
        Staticmethod.display();
        System.out.println(Staticmethod.x);
    }
}