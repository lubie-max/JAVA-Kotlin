package MultiThreading.Synchronization;

public class MyThread extends  Thread {
    private final Counter counter ;

    MyThread(Counter counter){
        this.counter = counter ;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            counter.increament();
        }
    }
}
