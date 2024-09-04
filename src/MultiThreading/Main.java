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

        for(int i = 1 ; i < 199999 ; i ++){
        System.out.println(Thread.currentThread().getName());

        }
    }

}
