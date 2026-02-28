package Threads.WaysOfCreatingThreads.ThreadClass.Ex1;

class MyThread extends Thread{
    public void run() {
        System.out.println("Thread is running....");
    }
}
public class Demo {
    public static void main(String[] args) {
        MyThread t1= new MyThread();
        t1.start();

    }
}
//run()-> is a method overridden when thread is created in class
//start()->the thread will start working and automatically run with that