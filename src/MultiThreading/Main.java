package MultiThreading;

public class Main {

    public static void main(String[] args) {
        System.out.println("::::::::::: Multi-Threading ::::::::");
        /*
        to create thread in java we can either extend a Thread class or implement Runnable interface

         */

        // with Thread class
        NewThread t1 = new NewThread();
        t1.start();

        /// from runnable interface
//        SecondNewThread t2 = new SecondNewThread();
//        t2.run();

        // using runnable interface's instance with Thread class method start
        SecondNewThread secondNewThread = new SecondNewThread();
        Thread  Ti = new Thread(secondNewThread);
        Ti.start();



        for(int i = 1 ; i < 10 ; i ++){
        System.out.println(Thread.currentThread().getName());

        }
    }

}
