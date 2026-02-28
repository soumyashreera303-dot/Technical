package Threads.MainSingleThread;

public class Demo {
    public static void main(String[] args) {//Main is a thread
        System.out.println("Main thread started!!!");
        for(int i=0; i<5; i++){
            System.out.println("Main thread: "+i);
        }
        System.out.println("Main thread stopped!!!");
    }
}
