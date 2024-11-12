package MultiThreading.Synchronization;

public class Sync {
    public static void main(String[] args) {

        Counter counter = new Counter();

        MyThread t1 = new MyThread(counter);
        MyThread t2 = new MyThread(counter);

        t1.start();
        t2.start();

    try {

        t1.join();
        t2.join();

    } catch (Exception _){

    }


        System.out.println(counter.getCounter());
    }
}
