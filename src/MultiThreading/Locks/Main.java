package MultiThreading.Locks;

public class Main {

    public static void main(String[] args) {

        System.out.println("Locks");

        Bank cbi = new Bank();

        Runnable t1 = new Runnable(){
            @Override
            public void run() {
                cbi.withdrawMoney(50);
            }
        };


    }
}
