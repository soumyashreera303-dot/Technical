package com.cs_is.oops.pillars.polymorphism.overriding;

public class RBI {
    double RateOfInterest(){
        return 6.5;
    }
}
class ICICI extends RBI{
    @Override
    double RateOfInterest(){
        return 7.2;
    }
}
class HDFC extends RBI{
    @Override
    double RateOfInterest(){
        return 7.8;
    }
}
class Demo{
    public static void main(String[] args){
        //The Reference doesn't matter, the object type matters
        RBI rbi = new RBI();
        RBI icici = new ICICI();
        RBI hdfc = new HDFC();
        System.out.println("RBI rbi: " + rbi.RateOfInterest() + "%");
        System.out.println("ICICI rbi: " + icici.RateOfInterest() + "%");
        System.out.println("HDFC rbi: " + hdfc.RateOfInterest() + "%");
    }
}
