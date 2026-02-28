package Threads.ThreadJoin.Ex1;

class MyTask implements Runnable{
    public void run(){
        for (int i=1; i<=5; i++){
            System.out.println("Child "+ i);
        }
    }
}
public class sameexampleusingRunnable {
    public static void main(String[] args) throws Exception{
        MyTask t1 = new MyTask();
        Thread t2= new Thread();
        t1.run();
        t2.join();
        System.out.println("Main thread finished!!!");
    }
}

