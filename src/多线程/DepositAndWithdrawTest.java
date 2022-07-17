package 多线程;

/**
 * *@Author LiGuanda
 * *@Data 2022/4/18 上午 9:37
 * *@Description This is a description of DepositAndWithdrawTest
 * *@Params
 * *@Return
 * *@Since versio-1.0
 */


public class DepositAndWithdrawTest {

    public static void main(String[] args) {

        Account3 a = new Account3("6666", 666);
        Deposit d = new Deposit(a);
        Deposit d1 = new Deposit(a);
        Withdraw1 w = new Withdraw1(a);
        Withdraw1 w1 = new Withdraw1(a);
        Deposit d2 = new Deposit(a);
        Withdraw1 w2 = new Withdraw1(a);
        Deposit d3 = new Deposit(a);
        Withdraw1 w3 = new Withdraw1(a);
        Deposit d4 = new Deposit(a);
        Withdraw1 w4 = new Withdraw1(a);
        Deposit d5 = new Deposit(a);
        Withdraw1 w5 = new Withdraw1(a);

        w.start();
        w1.start();
        d.start();
        d1.start();
        w2.start();
        w3.start();
        d2.start();
        d3.start();
        w4.start();
        w5.start();
        d4.start();
        d5.start();


    }

}

class Account3 {

    public String number;
    public double balance;

    public Account3() {

        ;

    }

    public Account3(String number, double balance) {

        this();
        this.number = number;
        this.balance = balance;

    }

    @Override
    public int hashCode() {

        return new Integer(this.number).intValue() * ((int) Math.random() * 1000) + (int) this.balance * ((int) Math.random() * 100) + (int) Math.random() * 10;

    }

    @Override
    public boolean equals(Object o) {

        if (o instanceof Account3) {

            Account3 a = (Account3) o;
            return this.number == a.number;

        } else {

            return false;

        }

    }

}

class Deposit extends Thread {

    public Account3 a = null;

    public Deposit(Account3 a) {

        this.a = a;

    }

    @Override
    public void run() {

        synchronized (a) {

            while (true) {

                if (a.balance < 100) {

                    //a.notify();
                    a.balance += 200;
                    System.out.println(Thread.currentThread().getName() + "\tDeposit 200 dallars! The current balacne is : " + a.balance);

                } else {

                    try {

                        a.notifyAll();
                        a.wait();

                    } catch (InterruptedException e) {

                        e.printStackTrace();

                    }

                }

            }

        }

    }

}

class Withdraw1 extends Thread {

    Account3 a = null;

    public Withdraw1(Account3 a) {

        this.a = a;

    }

    @Override
    public void run() {

        synchronized (a) {

            while (true) {

                if (a.balance >= 100) {

                    //a.notify();
                    a.balance -= 100;
                    System.out.println(Thread.currentThread().getName() + "\tWithdraw 100 dollars! The current balance is : " + a.balance);


                } else {

                    try {

                        a.notifyAll();
                        a.wait();

                    } catch (InterruptedException e) {

                        e.printStackTrace();

                    }


                }


            }

        }

    }

}



