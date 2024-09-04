package MultiThreading;

public class NewThread extends Thread{

    @Override
    public void run() {
//        super.run();
                for (int i = 0; i < 1000000; i++) {
                    System.out.println(Thread.currentThread().getName());

        }
    }
}
