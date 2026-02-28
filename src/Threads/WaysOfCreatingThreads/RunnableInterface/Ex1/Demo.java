package Threads.WaysOfCreatingThreads.RunnableInterface.Ex1;

class MyTask implements Runnable{
    public void run(){
        System.out.println("Thread is running...");
    }
}

public class Demo {
    public static void main(String[] args) {
        MyTask obj = new MyTask();
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);

        t1.start();
        t2.start();
    }
}
