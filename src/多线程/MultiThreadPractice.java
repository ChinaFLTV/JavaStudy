package 多线程;

import java.util.Objects;

/**
 * *@Author LiGuanda
 * *@Data 2022/4/17 下午 3:56
 * *@Description This is a description of MultiThreadPractice
 * *@Params
 * *@Return
 * *@Since versio-1.0
 */


public class MultiThreadPractice {

    public static void main(String[] args) {

/*        Thread t25 = new 多线程.Station("heihei");
        Thread t26 = new 多线程.Station("haha");
        Thread t27 = new 多线程.Station("hehe");*/

        //t25.start();
        //t25.start();
        //t27.start();
        Bank bank = new Bank();
        PersonA p = new PersonA(bank,"ATM");
        PersonB p1 = new PersonB(bank,"Counter");

    }

}

class Bank {

    public static double money = 1000;

    private void Counter(double money) {

        Bank.money -= money;
        System.out.println("Counter withdraws money!\tThe current money is : " + Bank.money);

    }

    private void ATM(double money) {

        Bank.money += money;
        System.out.println("ATM collects money!\tThe current money is : " + Bank.money);

    }

    public synchronized void outMoney(double money, String mode) throws Exception {

        if (money > Bank.money) {

            throw new Exception("Withdraw failed!");

        }

        if (Objects.equals(mode, "ATM")) {

            ATM(money);

        } else {

            Counter(money);

        }

    }


}

class PersonA extends Thread {

    Bank bank;
    String mode;

    public PersonA(Bank bank, String mode) {

        this.bank = bank;
        this.mode = mode;

    }

    @Override
    public void run() {

        while (bank.money >= 200) {

            try {

                bank.outMoney(200, mode);
                sleep(100);

            } catch (Exception ioe) {

                ioe.printStackTrace();
                ioe.getMessage();

            }


        }
    }

}

class PersonB extends Thread {

    Bank bank;
    String mode;

    public PersonB(Bank bank, String mode) {

        this.bank = bank;
        this.mode = mode;

    }

    @Override
    public void run() {

        while (bank.money >= 100) {

            try {

                bank.outMoney(100, mode);
                sleep(100);

            } catch (Exception ioe) {

                ioe.printStackTrace();
                ioe.getMessage();

            }


        }
    }


}


class Station extends Thread {

    public int tick = 20;
    public Object ob = "aa";

    public Station(String name) {

        super(name);

    }

    @Override
    public void run() {

        while (tick > 0) {

            synchronized (ob) {

                if (tick > 0) {

                    System.out.println(Thread.currentThread().getName() + "has sold" + tick + " ticks.");
                    tick--;

                } else {

                    System.out.println("Tick has sold out!");

                }

            }

            try {

                sleep(1000);

            } catch (InterruptedException e) {

                e.printStackTrace();

            }

        }

    }

}
