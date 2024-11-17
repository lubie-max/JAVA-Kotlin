package MultiThreading.Locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bank {

    private final Lock lock = new ReentrantLock();

    float Balance = 500;

    public synchronized void  withdrawMoney(float amount){
        lock.lock();
        if (amount<=  Balance) {
            try {
                System.out.println("Withdrawal is initiated!");
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(5000);

                Balance-=amount;
                System.out.println("Withdrawal is successful , your balance is : " + Balance);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        else {
            System.out.println("Invalid Amount.");
        }
    }


}
