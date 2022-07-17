package 多线程;

/**
 * *@Author LiGuanda
 * *@Data 2022/4/18 上午 9:26
 * *@Description This is a description of MultiThreadPractice2
 * *@Params
 * *@Return
 * *@Since versio-1.0
 */


public class MultiThreadPractice2 {

    public static void main(String[] args) {

        Count c = new Count();
        Subthread1 s1 = new Subthread1(c);
        Subthread1 s2 = new Subthread1(c);

        s1.setName("Thread 1 ");
        s2.setName("Thread 2 ");
        s1.start();
        s2.start();


    }

}

class Count {

    public static int i = 1;
}

class Subthread1 extends Thread {

    public Count lock = null;

    public Subthread1(Count lock) {

        this.lock = lock;

    }

    @Override
    public void run() {

        synchronized (lock) {

            while (lock.i <= 100) {


                try {

                    lock.notify();
                    System.out.println(Thread.currentThread().getName() + "is printing~~" + lock.i++);
                    lock.wait();

                }catch(InterruptedException ie){

                    ie.printStackTrace();
                    ie.getCause();

                }

            }

        }

    }

}
