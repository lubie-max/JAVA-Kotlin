package MultiThreading.Locks;

import javax.naming.Name;

public class Main {

    public static void main(String[] args) {

        System.out.println("Locks");

        Bank cbi = new Bank();

        Runnable w1 = new Runnable(){
            @Override
            public void run() {
                cbi.withdrawMoney(50);
            }
        };


        Thread t1 = new Thread(w1 );
        Thread t2 = new Thread(w1);
        t1.start();
        t2.start();

    }
}
