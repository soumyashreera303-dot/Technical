package Threads.WaysOfCreatingThreads.ThreadClass.Ex2;

class MyThread extends Thread{
    public void run(){
        for (int i=0; i<=5;i++){
            System.out.println("My thread is running...."+ i);
        }
    }
}
public class Demo {
    public static void main(String[] args) {
        MyThread t1= new MyThread();
        t1.start();

        for (int i=0; i<=5;i++){
            System.out.println("Main is running...."+ i);
        }
    }
}
/*
start()-> creates new thread
run()->
 */
