package com.cs_is.oops.pillars.Abstraction.Demo;

abstract class Vehicle {
     abstract void NoOfWheels();

     void ModeOfTransport(){
         System.out.println("Land");
     }
}
class Cars extends Vehicle{
    void NoOfWheels(){
        System.out.println("Car is 4 wheeler");
    }
}
class Bike extends Vehicle{
    void NoOfWheels(){
        System.out.println("Bike is 2 wheeler");
    }
}
class GoodsCarrier extends Vehicle{
    void NoOfWheels(){
        System.out.println("GoodsCarrier is 8 wheeler");
    }
}

class Transport{
    public static void main(String[] args) {
        Cars c= new Cars();
        c.NoOfWheels();
        c.ModeOfTransport();

        Bike b= new Bike();
        b.NoOfWheels();
        b.ModeOfTransport();

        GoodsCarrier gd= new GoodsCarrier();
        gd.NoOfWheels();
        gd.ModeOfTransport();

    }
}