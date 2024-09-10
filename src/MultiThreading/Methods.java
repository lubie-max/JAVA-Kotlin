package MultiThreading;

public class Methods extends  Thread{


    public void run(){


        for (int i = 0; i <  10 ; i++) {

            System.out.println("thread's Priority -> " + Thread.currentThread().getPriority());
            
        }
    }

    public static void main(String[] args) {
        Methods t1 = new Methods();
        t1.start();

    }
}
