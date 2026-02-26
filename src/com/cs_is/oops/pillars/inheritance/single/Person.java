package com.cs_is.oops.pillars.inheritance.single;

public class Person {
    String name;
    Person(String name){
        this.name=name;
    }

}
class Student extends Person{
    int rollNo;
    Student(int rollNo,String name){
        super(name);
        this.rollNo=rollNo;
    }
    void display(){
        System.out.println(rollNo+" "+name);
    }

    public static void main(String[] args) {
        Student s=new Student(21,"Abhimanyu");
        s.display();
    }
}
/*
Points to remember
✅Super.something-> variable or method
☑️super() -> parent class constructor
❌super. ->Don't use for constructor
 */