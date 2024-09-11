package MultiThreading;

public class Methods extends  Thread{


    public void run(){


        for (int i = 0; i <  5 ; i++) {

            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("thread's Priority -> " + Thread.currentThread().getPriority());
            
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Methods t1 = new Methods();
        t1.start();
        t1.setPriority(1);
        t1.join();

        System.out.println("Main Thread Execution");

    }
}
