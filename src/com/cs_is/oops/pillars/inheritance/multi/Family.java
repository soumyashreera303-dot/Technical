package com.cs_is.oops.pillars.inheritance.multi;

interface Mom{
    default void cook(){
        System.out.println("Indian");
    }
}
interface Dad{
    default void cook(){
        System.out.println("Chinese");
    }
}

class Child implements Mom, Dad{
    public void cook(){
        //System.out.println("Indian");
        Dad.super.cook();
    }
}

class Family{
    public static void main(String[] args){
        Child c= new Child();
        c.cook();
    }
}