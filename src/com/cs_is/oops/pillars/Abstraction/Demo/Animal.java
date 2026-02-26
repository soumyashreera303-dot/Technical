package com.cs_is.oops.pillars.Abstraction.Demo;

abstract class Animal {
    Animal(){
        String name;
    }
    abstract void sound();

    void run(){
        System.out.println("Running.....");
    }
}

class Lion extends Animal{
    void sound(){
        System.out.println("Roars");
    }
    void Animal(){
        System.out.println("Lionnn");
    }
}

class Cat extends Animal{
    void sound(){
        System.out.println("Meow");
    }
}

class Driver{
    public static void main(String[] args){
        Lion l= new Lion();
        l.sound();
        l.run();
        l.Animal();
        Cat c= new Cat();
        c.sound();
        c.run();
    }
}
//Partial abstraction