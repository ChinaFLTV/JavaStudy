package 多线程;

/**
 * *@Author LiGuanda
 * *@Data 2022/4/18 下午 9:53
 * *@Description This is a description of SellTicketTest
 * *@Params
 * *@Return
 * *@Since versio-1.0
 */


public class SellTicketTest {

    public static void main(String[] args) {

        Ticket1 t = new Ticket1(1000);

        SellTicketWindow s1 = new SellTicketWindow(t);
        SellTicketWindow s2 = new SellTicketWindow(t);
        SellTicketWindow s3 = new SellTicketWindow(t);

        s1.start();
        s2.start();
        s3.start();


    }


}

class Ticket1 {

    public static int amount;

    public Ticket1(int amount) {

        this.amount = amount;

    }

}

class SellTicketWindow extends Thread {

    Ticket1 t = null;

    public SellTicketWindow(Ticket1 t) {

        this.t = t;

    }

    @Override
    public void run() {

        while (true) {

            synchronized (t) {

                t.notifyAll();
                t.amount--;
                System.out.println(Thread.currentThread().getName() + "\t\thas sold 1 ticket!The current amount of tickets is : " + t.amount);
                try {

                    t.wait();

                } catch (InterruptedException e) {

                    e.printStackTrace();

                }
                if(t.amount<=0){

                    Thread.currentThread().stop();

                }

            }


        }

    }

}
