package com.cs_is.oops.thisKeyword;

public class Demo {
    //this keyword refers to current class members
    String i; //Instance variable
    void change(String i){
        this.i = i;// to remove ambiguity (confusions)
    }
    void display(){
        System.out.println("The value of i is : " +i);
    }
    public static void main(String[] args){
        Demo d= new Demo();
        d.change("ISE");
        d.display();

    }
}
