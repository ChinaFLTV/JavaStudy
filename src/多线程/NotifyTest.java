package 多线程;

/**
 * *@Author LiGuanda
 * *@Data 2022/4/18 上午 8:49
 * *@Description This is a description of NotifyTest
 * *@Params
 * *@Return
 * *@Since versio-1.0
 */


public class NotifyTest {

    public static void main(String[] args) {

        Object lock = new Object();
        Notified n = new Notified(lock);
        Thread t29 = new Thread(new Notifying(lock));
        n.start();
        t29.start();


    }


}

class Notified extends Thread {


    public Object lock = null;

    public Notified(Object lock) {

        this.lock = lock;

    }

    @Override
    public void run() {

        try {

            synchronized (lock) {

                lock.wait();
                System.out.println("Notified's waiting was completed!");
                lock.notify();

            }

        } catch (Exception ie) {

            ie.printStackTrace();
            ie.getMessage();

        }

    }


}

class Notifying implements Runnable {

    public Object lock = null;

    public Notifying(Object lock) {

        this.lock = lock;

    }

    @Override
    public void run() {


        synchronized (lock) {

            System.out.println("Notifying was on operation!");
            lock.notifyAll();
            System.out.println("Notifying's operation was competed !");


            try {

                //Thread.sleep(2000);
                lock.wait();
                System.out.println("Notifying works again!");

            } catch (Exception e) {

                e.printStackTrace();
                e.getLocalizedMessage();

            }

        }

    }

}
