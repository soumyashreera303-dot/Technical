package com.cs_is.oops.pillars.polymorphism.overriding;

import java.lang.foreign.SymbolLookup;

public class Animal {
    void eat(){
        System.out.println("Animal eats food");
    }
    void sound(){
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog Barks!!!!!!!!!!!!");
    }
}
class Puppy extends Dog{
    @Override
    void eat(){
        super.eat();
        System.out.println("Puppy drinks  ");
    }
}
class Main{
    public static void main(String[] args){
        Animal animal = new Puppy();
        animal.eat();// from Dog class + Animal ???(super.eat)
        animal.sound();// from Dog class
    }
}