package com.cs_is.oops.pillars.Abstraction.Constructor;

abstract class Animal{
    Animal() {
        System.out.println("Animal Constructor");
    }
    abstract void sound();
}
class Dog extends Animal{
    Dog(){
        System.out.println("Dog Constructor");
    }
    void sound() {
        System.out.println("Dog Barks");
    }
}

class Driver{
    public static void main(String[] args) {
        Dog d= new Dog();
        d.sound();
    }
}

/*
Why does abstract class have constructor?
-> Constructors are used for initializing common data!
->When a child class object is created, the Parent class
    constructor runs first.
->Parent constructor is getting executed because of inheritance
      because of object creation.
 */