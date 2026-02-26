package com.cs_is.oops.pillars.Abstraction.Interface.DefalutMethods.HowToAccessDefault;

public interface Vehicle {
    default void stop(){
        System.out.println("Stopped!!!");
    }
}

class Car implements Vehicle{
    void CarFunction(){
        System.out.println("CarFunction");
    }
}

class Bike implements Vehicle{
    public void stop(){
        System.out.println("Bike Stopped!!!");
    }
}

class Driver{
    static void main(String[] args) {
        Car c1= new Car();//Normal way
        c1.stop();// 1st way to access default method

        Vehicle v= new Car();//Upcasting
        v.stop();//2nd way to access default method

        Bike b= new Bike();//Overriding
        b.stop();//3rd way to access default method
    }
}