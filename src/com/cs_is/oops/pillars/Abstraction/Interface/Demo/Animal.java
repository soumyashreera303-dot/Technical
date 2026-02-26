package com.cs_is.oops.pillars.Abstraction.Interface.Demo;

public interface Animal {
    void sound(); // Abstract method

    void run();// Abstract method
}

class Lion implements Animal{
    public void sound(){
        System.out.println("Roars");
    }

    @Override
    public void run() {
        System.out.println("Runninggg.....");
    }
}

class Driver{
    public static void main(String[] args){
        Lion l=new Lion();
        l.sound();
        l.run();
    }
}
