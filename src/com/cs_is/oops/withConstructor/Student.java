package com.cs_is.oops.withConstructor;

public class Student {
    int USN;
    String name;
    int marks;
    //Static is not for object - it directly belongs to the class
    static String college= "SNPSU"; // use for common parameters
    Student(String name, int USN, int marks){
        this.name = name;
        this.USN= USN;
        this.marks= marks;
    }
    void evaluateMarks(){
        if(marks>=40){
            System.out.println(name +" has passed");
        }else{
            System.out.println(name +" has failed");
        }
    }
    void StudentDetails(){
        System.out.println();
        System.out.println("Name: "+this.name);
        System.out.println("USN: "+this.USN);
        System.out.println("Marks: "+this.marks);
        System.out.println("College: "+ college);
        System.out.println();
    }
    public static void main(String[] args){
        //Object creation=>ClassName obj=new ClassName();
        Student s1=new Student("Vikrant", 100,90);
        Student s2=new Student("Vikram", 101,80);

        s1.evaluateMarks();
        s2.evaluateMarks();
        s1.StudentDetails();
        s2.StudentDetails();
    }
}