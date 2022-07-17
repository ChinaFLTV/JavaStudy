package 数组;


import java.util.concurrent.ThreadLocalRandom;

public class getRandomDigit_between1And30_thread {

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {

            new myThread().start();

        }


    }


}


class myThread extends Thread {

    //@override
    public void run() {

        for (int i = 0; i < 10; i++) {

            System.out.println(Thread.currentThread().getName() + ": " + (int)(ThreadLocalRandom.current().nextDouble()*10+1));

        }


    }


}
