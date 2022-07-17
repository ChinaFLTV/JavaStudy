package 多线程;

import java.util.concurrent.locks.ReentrantLock;

/**
 * *@Author LiGuanda
 * *@Data 2022/4/17 上午 10:08
 * *@Description This is a description of LockTest
 * *@Params
 * *@Return
 * *@Since versio-1.0
 */


public class LockTest {

    public static void main(String[] args) throws InterruptedException {

        final StringBuffer s1 = new StringBuffer();
        final StringBuffer s2 = new StringBuffer();

        new Thread() {

            @Override
            public void run() {

                synchronized (s1) {

                    s2.append('A');
                    synchronized (s2) {

                        s2.append('B');
                        System.out.println(s1);
                        System.out.println(s2);


                    }
                }
            }
        }.start();

        new Thread() {


            @Override
            public void run() {

                final StringBuffer s3 = new StringBuffer();
                final StringBuffer s4 = new StringBuffer();

                synchronized (s3) {

                    s3.append('C');
                    synchronized (s4) {

                        s4.append('D');
                        System.out.println(s3);
                        System.out.println(s4);

                    }
                }

            }

        }.start();

        BankController bc = new BankController();
        Thread t19 = new Thread(bc);
        Thread t20 = new Thread(bc);
        Thread t21 = new Thread(bc);

       /* t19.setName("windows 4");
        t20.setName("windows 5");
        t21.setName("windows 6");

        t19.start();
        //t19.stop();
        //t19.sleep(2000);
        t19.yield();

        t20.start();
        t21.start();*/
/*
        CountPrint cp = new CountPrint();
        Thread t22 = new Thread(cp);
        Thread t23 = new Thread(cp);
        t22.setName("Thread 1 ");
        t23.setName("Thread 2 ");
        t22.start();
        t23.start();

        Clerk clerk = new Clerk();
        Thread proThread = new Thread(new Productor(clerk));
        Thread conThread = new Thread(new Consumer(clerk));

        proThread.start();
        conThread.start();*/

        System.out.println("------------------exquisite segment line----------------");
        AccountEnhance ae = new AccountEnhance("666666", 200);
        Thread t23 = new Thread(new Withdraw(ae));
        Thread t24 = new Thread(new DepositMom(ae));
        t23.start();
        t24.start();


    }

}

class LocksTest implements Runnable {

    private final ReentrantLock rtl = new ReentrantLock();


    @Override
    public void run() {

        rtl.lock();
        try {

            System.out.println("heiheihei");

        } finally {

            rtl.unlock();

        }

    }

}

class BankController implements Runnable {

    private static int balance = 0;
    private final ReentrantLock lock = new ReentrantLock();


    @Override
    public void run() {

        lock.lock();
        try {

            while (true) {


                balance += 1000;
                System.out.println("The " + Thread.currentThread().getName() + " message :\t\tThe current banlace after deposit : " + balance);
                if (balance > 1000000) {

                    break;

                }

            }
        } catch (Exception e) {

            e.printStackTrace();
            e.getLocalizedMessage();

        } finally {

            lock.unlock();

        }

    }

}

class CountPrint implements Runnable {

    private static int i = 1;
    ReentrantLock lock = new ReentrantLock();


    @Override
    public void run() {


        while (i < 100) {

            synchronized (this) {

                notify();
                i = i + 1;
                System.out.println(Thread.currentThread().getName() + "\t\t" + i);
                try {

                    wait();

                } catch (InterruptedException e) {

                    e.printStackTrace();

                }

            }

        }

    }

}

class Clerk {

    private int product = 0;

    public synchronized void addProduct() throws InterruptedException {

        if (product < 20) {

            product++;
            System.out.println("There are leaving " + product + "products right now!");
            notifyAll();

        } else {

            wait();

        }

    }

    public synchronized void getProduct() throws InterruptedException {

        if (product <= 0) {

            try {

                wait();

            } catch (InterruptedException ie) {

                ie.printStackTrace();
                ie.getMessage();

            }
        } else {

            System.out.println("Consumer has taken the " + product-- + "product!");
            notifyAll();

        }

    }

}

class Productor implements Runnable {

    Clerk clerk;

    public Productor(Clerk clerk) {

        this.clerk = clerk;

    }

    @Override
    public void run() {

        System.out.println("Productors start to yield productions!");
        while (true) {


            try {

                Thread.sleep((int) Math.random() * 1000);


            } catch (InterruptedException e) {

                e.printStackTrace();

            }

            try {

                clerk.addProduct();

            } catch (InterruptedException e) {

                e.printStackTrace();

            }


        }

    }

}

class Consumer implements Runnable {

    Clerk clerk;

    public Consumer(Clerk clerk) {

        this.clerk = clerk;

    }

    @Override
    public void run() {

        try {

            Thread.sleep((int) Math.random() * 1000);
            clerk.getProduct();

        } catch (InterruptedException e) {

            e.printStackTrace();

        }

    }

}

class AccountEnhance {

    public String number;
    public double balance;

    public AccountEnhance() {

        ;

    }

    public AccountEnhance(String number) {

        this();
        this.number = number;

    }

    public AccountEnhance(String number, double balance) {

        this(number);
        this.balance = balance;

    }

    public String getNumber() {

        return this.number;

    }

    public double getBalance() {

        return this.balance;

    }

    public void setNumber(String number) {

        this.number = number;

    }

    public void setNumber(double balance) {

        this.balance = balance;

    }

    @Override
    public int hashCode() {

        return new Integer(number).intValue() + (int) this.balance * 1000 + (int) Math.random() * 1000;

    }

    @Override
    public boolean equals(Object o) {

        if (o instanceof AccountEnhance) {

            AccountEnhance o1 = (AccountEnhance) o;
            if (this.number == o1.number) {

                return true;

            } else {

                return false;

            }

        } else {

            return false;

        }

    }


}

class Withdraw implements Runnable {

    AccountEnhance ae = null;

    public Withdraw() {

        ;

    }

    public Withdraw(AccountEnhance ae) {

        this.ae = ae;

    }

    @Override
    public void run() {

        synchronized (ae) {

            if (ae.balance < 100) {

                try {

                    wait();

                } catch (InterruptedException ie) {

                    ie.printStackTrace();
                    ie.getLocalizedMessage();

                }

            } else {

                ae.balance -= 100;
                System.out.println("Xiaoming hai withdrawn 100 dollars!! The current balance is : " + ae.balance);

                //Thread.currentThread().sleep(1000);
                //notifyAll();
                //wait();

            }

        }

    }

}

class DepositMom implements Runnable {

    AccountEnhance ae = null;

    public DepositMom() {

        ;

    }

    public DepositMom(AccountEnhance ae) {

        this.ae = ae;

    }

    @Override
    public void run() {

        synchronized (ae) {

            while (true) {

                if (ae.balance >= 100) {

                    //wait();

                } else {

                    ae.balance += 200;
                    System.out.println("Mom has depositted 200 dollars again!Don't spend money like water!!! The current balance is : " + ae.balance);

                    //Thread.currentThread().sleep(1000);
                    notifyAll();

                }

            }

        }

    }

}