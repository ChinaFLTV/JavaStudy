package 多线程;

/**
 * *@Author LiGuanda
 * *@Data 2022/4/18 下午 4:23
 * *@Description This is a description of MultiThreadPractice3
 * *@Params
 * *@Return
 * *@Since versio-1.0
 */


public class MultiThreadPractice3 {

    public static void main(String[] args) throws InterruptedException {

        MyThread m1 = new MyThread("Dage1", (int) (Math.random() * 1000));
        MyThread m2 = new MyThread("Dage2", (int) (Math.random() * 1000));
        MyThread m3 = new MyThread("Dage3", (int) (Math.random() * 1000));
        m1.start();
        m2.start();
        m1.join();
        m3.start();

        System.out.println("---------------exqusite segment line--------------");
        Num n = new Num();
        MyThread1 m4 = new MyThread1(n);
        MyThread1 m5 = new MyThread1(n);
        MyThread1 m6 = new MyThread1(n);
        MyThread1 m7 = new MyThread1(n);

        m4.start();
        m5.start();
        m6.start();
        m7.start();


    }

}

class MyThread extends Thread {

    public String threadName;
    public int sleepTime;

    public MyThread(String threadName, int sleepTime) {

        super(threadName);
        this.threadName = threadName;
        this.sleepTime = sleepTime;

    }

    @Override
    public void run() {

        System.out.println("Thread name : " + Thread.currentThread().getName() + "\t\tSleep time : " + this.sleepTime);

    }

}

class Num {

    public static int i = 1;

}

class MyThread1 extends Thread {

    public Num n = null;

    public MyThread1(Num n) {

        this.n = n;

    }

    @Override
    public void run() {

        while (n.i <= 50) {

            synchronized (n) {

                n.notifyAll();
                System.out.println(Thread.currentThread().getName() + "\t\t" + n.i++);

                try {

                    n.wait();

                } catch (InterruptedException e) {

                    e.printStackTrace();

                }

            }

        }

    }

}


