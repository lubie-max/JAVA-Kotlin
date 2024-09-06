package MultiThreading;

public class NewThread extends Thread{

    @Override
    public void run() {
//        super.run();
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName()+ " -> " + i);

        }
    }
}
