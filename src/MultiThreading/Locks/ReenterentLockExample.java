package MultiThreading.Locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReenterentLockExample {

    Lock lock = new ReentrantLock();

    public void OuterMethod(){
        lock.lock();
    try {
        System.out.println("Outer Method Lock");
    }
    catch (Exception e){
        System.out.println(e);
    }

    finally {
        lock.unlock();
    }
    }

    public  void  InnerMethod(){
        lock.lock();

        try {
            System.out.println("Inner Method Lock");
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            lock.unlock();
        }

    }



    public static void main(String[] args) {
        ReenterentLockExample example = new ReenterentLockExample();

        example.OuterMethod();
        example.InnerMethod();
    }
}


/*
*  Imagine it as 'Ghar ki Chavi' -> main multipurpose  (outer lock)
* And   second 'Tijori ki chavi' -> unique single-purpose (inner lock)
* first we have to close 'tijori' in order to go outside and then have to lock the house with main key.
*
* Lock allows to access the resource at a time to a thread. and provides more control over the threads.
*
*
* */
