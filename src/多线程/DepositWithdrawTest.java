package 多线程;

/**
 * *@Author LiGuanda
 * *@Data 2022/4/17 下午 5:07
 * *@Description This is a description of DepositWithdrawTest
 * *@Params
 * *@Return
 * *@Since versio-1.0
 */


public class DepositWithdrawTest {

    public static void main(String[] args) {

        Balance1 b1 = new Balance1();
        BankSystem1 b = new BankSystem1(b1);
        BankSystem1 b2 = new BankSystem1(b1);
        b.start();
        b2.start();

        Balance2 b4 = new Balance2();
        Thread t27 = new Thread(new add(new Supplier(b4)));
        Thread t28 = new Thread(new minus(new Consumer1(b4)));
        t27.start();
        t28.start();


    }


}

class Balance1 {

    public static int balance = 1000;

}

class BankSystem1 extends Thread {

    Balance1 b = null;

    public BankSystem1(Balance1 b) {

        this.b = b;

    }

    public synchronized void addMoney() {

        b.balance += 100;
        System.out.println("addMoney : " + b.balance);

    }

    public synchronized void minusMoney() {

        b.balance -= 100;
        System.out.println("minusMoney : " + b.balance);

    }

    @Override
    public void run() {

        if (b.balance <= 0) {

            addMoney();

        } else {

            minusMoney();

        }

    }


}


class Balance2 {

    public static int balance = 1000;

}

class Supplier {

    Balance2 b = null;

    public Supplier(Balance2 b) {

        this.b = b;

    }


    public void addBalance() {

        b.balance += 200;
        System.out.println("Add balance : " + b.balance);

    }

}

class Consumer1 {

    Balance2 b = null;

    public Consumer1(Balance2 b) {

        this.b = b;

    }


    public void minusBalance() {

        b.balance -= 200;
        System.out.println("Minus balance : " + b.balance);

    }


}

class add implements Runnable {

    public Supplier s = null;

    public add(Supplier s) {

        this.s = s;

    }

    @Override
    public synchronized void run() {

        while (true) {
            if (s.b.balance <= 0) {

                try {

                    wait();

                } catch (InterruptedException e) {

                    e.printStackTrace();

                }

            } else {

                s.addBalance();
                notifyAll();

            }

        }

    }

}


class minus implements Runnable {

    public Consumer1 s = null;

    public minus(Consumer1 s) {

        this.s = s;

    }

    @Override
    public synchronized void run() {

        while (true) {

            if (s.b.balance <= 0) {

                try {

                    wait();

                } catch (InterruptedException e) {

                    e.printStackTrace();

                }

            } else {

                s.minusBalance();
                notifyAll();

            }

        }

    }

}