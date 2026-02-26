package com.cs_is.oops.pillars.encapsulation;

public class Std {
    private String name;
    private int usn;

    Std(String name, int usn){
        this.name= name;
        this.usn= usn;
    }

    String getName(){
        return this.name;
    }
    int getusn(){
        return this.usn;
    }

    void setName(String name){
        this.name=name;
    }
    void setusn(int usn){
        this.usn = usn;
    }

    void printDerail(){
        System.out.println("Student name" + name);
        System.out.println("Student USN" + usn);

    }
}
class Driver{
    static void main(String[] args) {
        Std s1= new Std("SSSSS", 1);
        s1.printDerail();
        System.out.println("Name: " + s1.getName());
        s1.setName("NNN");
        System.out.println("Usn: " + s1.getName());
        s1.setusn(123);
        System.out.println("Usn: " + s1.getusn());


    }
}