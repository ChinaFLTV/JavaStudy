package 多线程;

/**
 * *@Author LiGuanda
 * *@Data 2022/4/16 下午 9:25
 * *@Description This is a description of MultiThreadTest
 * *@Params
 * *@Return
 * *@Since versio-1.0
 */


public class MultiThreadTest {

    public static void main(String[] args) throws InterruptedException {

        Thread t = new Thread();
        Thread t1 = new Thread("heihei");
        Thread st1 = new SingleThread();
        st1.start();
        st1.run();
        Thread t3 = new Thread(new SingleThread1());
        t3.start();
        System.out.println("-----------------exquisite segment line------------------");

        Thread t4 = new SingleThread2();
        Thread t5 = new Thread(new SingleThread3());
        System.out.println(t4.getName());
        System.out.println("-----------------exquisite segment line----------------");
        t4.start();
        t4.yield();
        t5.start();
        //System.out.println(t4.getName());
        Thread t6 = new Thread(new SingleThread4());
        t6.start();
        System.out.println(t6.getName());
        t6.run();
        t6.setName("DageThread");
        System.out.println(t6.getName());
        Thread t8 = Thread.currentThread();
        System.out.println(t8.getName());
        Thread t9 = Thread.currentThread();
        System.out.println(t9.getName());
        Thread t10 = new Thread(new SingleThread5());
        t10.start();
        //t8.join();
        //t9.yield();
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("DageThread1");
        System.out.println(Thread.currentThread().getName());

        Thread t11 = new Thread(new SingleThread6());
        Thread t12 = new SingleThread7();
        System.out.println("-----------------exquisite segment line----------------");
        t11.start();
        //t11.sleep(2000);
        System.out.println(t11.isAlive());
        t12.start();
        //t11.sleep(2000);
        System.out.println(t11.isAlive());
        t12.join();
        Thread t13 = new Thread(new SingleThread6());
        t13.start();
        t13.stop();
        System.out.println(t13.isAlive());
        System.out.println(t13.getPriority());
        t13.setPriority(1);
        System.out.println(t13.getPriority());
        Thread t14 = new Thread(new SingleThread6());
        t14.start();
        //t14.wait();
        //t14.suspend();
        //t14.resume();
        t14.notify();





    }

}

class SingleThread extends Thread {

    public SingleThread() {

        super();

    }

    @Override
    public void run() {

        System.out.println("subclass1 : aha");

    }


}

class SingleThread1 implements Runnable {

    @Override
    public void run() {

        //System.out.println("subclass2 : heihei");

    }

}

class SingleThread2 extends Thread {

    @Override
    public void run() {

        for (int i = 0; i <= 100; i += 2) {

            System.out.println("subthread1 : " + i);

        }

    }

}

class SingleThread3 implements Runnable {

    @Override
    public void run() {

        for (int i = 1; i <= 100; i += 2) {

            System.out.println("subclass2 : " + i);

        }

    }

}

class SingleThread4 implements Runnable {

    @Override
    public void run() {

        System.out.println("singleThread 3 : heihei");

    }

}

class SingleThread5 extends Thread {

    @Override
    public void run() {

        System.out.println("singleThread 4 : haha");

    }

}

class SingleThread6 implements Runnable {

    @Override
    public void run() {

        for (int i = 1; i <= 100; i++) {

            System.out.println("SingleThread 6 : " + i);

        }

    }
}

class SingleThread7 extends Thread {

    @Override
    public void run() {

        for (int i = 1; i <= 100; i++) {

            System.out.println("SingleThread 7 : " + i);

        }

    }

}
