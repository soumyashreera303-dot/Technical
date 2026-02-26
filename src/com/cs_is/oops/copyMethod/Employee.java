package com.cs_is.oops.copyMethod;

public class Employee {
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    //Static cop method
    static Employee copy(Employee e) {
        return new Employee(e.id, e.name);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(101, "amit");
        Employee e2 = Employee.copy(e1);
        Employee e3 = e2;// Not recommended! Can lead to errors!
        e2.display();
    }
    static {
        System.out.println("Start of Execution");
        System.out.println("Database Loading");
        System.out.println("Internet Protocol Loading");
        System.out.println("System Files Loading");
    }
}


