package MultiThreading.Synchronization;

public class Counter {

    private  int count = 0 ; // shared resource

    public synchronized void  increament(){
        count ++ ;
    }

    public  int getCounter(){
        return  count;
    }


}
