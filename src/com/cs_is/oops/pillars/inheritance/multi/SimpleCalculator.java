package com.cs_is.oops.pillars.inheritance.multi;

public class SimpleCalculator {

    void add(int a, int b){
        System.out.println(a+b);
    }
}
class AdvCalc extends SimpleCalculator{
    void sub(int a, int b){
        System.out.println(a+b);
    }
}
class SuperAdv extends AdvCalc{
    void square(int x){
        System.out.println(x*x);
    }
}
class Main{
    public static void main(String[] args) {
        System.out.println("---------------------------------------");
        SimpleCalculator c1= new SimpleCalculator();
        c1.add(10,20);
        System.out.println("---------------------------------------");
        AdvCalc c2 = new AdvCalc();
        c2.add(5,10);
        c2.sub(10,5);
        System.out.println("---------------------------------------");
        SuperAdv c3=new SuperAdv();
        c3.add(1,2);
        c3.sub(9,4);
        c3.square(5);
    }
}
//A class cannot extend multiple classes because