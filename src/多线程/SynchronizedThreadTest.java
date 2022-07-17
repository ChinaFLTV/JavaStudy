package 多线程;

/**
 * *@Author LiGuanda
 * *@Data 2022/4/17 上午 9:41
 * *@Description This is a description of SynchronizedThreadTest
 * *@Params
 * *@Return
 * *@Since versio-1.0
 */


public class SynchronizedThreadTest {

    public static void main(String[] args) {

        Ticket ti = new Ticket();
        Thread t16 = new Thread(ti);
        Thread t17 = new Thread(ti);
        Thread t18 = new Thread(ti);
        t16.setName("windows 1");
        t17.setName("windows 2");
        t18.setName("windows 3");

        t16.start();
        t17.start();
        t18.start();


    }


}


class Ticket implements Runnable {

    private int tick = 100;


    @Override
    public synchronized void run() {

            while (true) {

                if (tick > 0) {

                    System.out.println(Thread.currentThread().getName() + "has sold tickets,the serial number of tick is : " + tick--);

                } else {

                    break;

                }

            }
        }

}


