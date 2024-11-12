package MultiThreading.ThreadMethods;

public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("Thread is running ...");

        for (int i = 0; i < 5  ; i++) {

            try {

                // Sleep Method
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);


        }

//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
    }



    public static void main(String[] args) throws InterruptedException {

        MyThread t1 = new MyThread();

        t1.start();
//        t1.join();

        System.out.println("Main Method.");

    }
}
